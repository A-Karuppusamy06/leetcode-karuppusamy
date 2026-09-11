// Last updated: 9/11/2026, 9:25:14 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];

                if (product < k) {
                    ans++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}