#include <iostream>
#include <vector>
using namespace std;

/**
 * 2 Pointer Approach.
*/
int maxArea(vector<int>& height) {
    int left = 0;
    int right = height.size() - 1;
    int maxArea = 0;

    while (left<right) {
        int current = min(height[left], height[right]) * (right - left);
        maxArea = max(maxArea, current);

        if (height[left] < height[right])
            left++;
        else
            right--;
    }
    return maxArea;
}

int main() {
    int height[9] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    vector<int> v;
    v.assign(height, height+9);
    cout << maxArea(v);
}