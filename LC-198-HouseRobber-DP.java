class LC198HouseRobberDP {
    class Solution {
        public void run() {
            int [] nums = {1, 2, 3, 1};
            System.out.println(rob(nums));
        }

        public int rob(int[] nums) {
            if (nums.length == 1)
                return nums[0];
            if (nums.length == 2) 
                return Math.max(nums[0], nums[1]);
            if (nums.length == 3) 
                return Math.max(nums[0] + nums[2], nums[1]);
            
            int [] result = new int[nums.length];
            result[0] = nums[0];
            result[1] = nums[1];
            result[2] = nums[0] + nums[2];

            for (int i = 3; i< nums.length; i++) {
                result[i] = Math.max(result[i-2] + nums[i], result[i-3] + nums[i]);
            }
            return Math.max(result[nums.length - 1], result[nums.length - 2]);
        }
    }

    public LC198HouseRobberDP() {
        Solution s = new Solution();
        s.run();
    }
}