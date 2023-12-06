public double FindMaxAverage(int[] nums, int k) {
    double avg = 0;

    // Get the initial max average
    for (int i = 0; i < k; i++) {
        avg += nums[i];
    }
    double maxAvg = avg/k;

    // Iterate through the rest of the array, while sliding the average of the "window" forward.
    for (int i = k; i < nums.Length; i++) {
        avg += nums[i] - nums[i-k];
        maxAvg = Math.Max(maxAvg, (avg/k));
    }

    return maxAvg;
}

Console.WriteLine(FindMaxAverage([1,12,-5,-6,50,3], 4));