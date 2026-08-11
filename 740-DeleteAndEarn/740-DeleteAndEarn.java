// Last updated: 8/11/2026, 6:33:17 PM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int n : nums)
            max = Math.max(max, n);

        int[] points = new int[max + 1];

        for (int n : nums)
            points[n] += n;

        int prev1 = 0, prev2 = 0;

        for (int p : points) {
            int curr = Math.max(prev1, prev2 + p);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}