// Last updated: 9/30/2026, 10:27:42 AM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int sum=0;
5        for(int i=0;i<nums.length;i+=2)
6        {
7            sum=sum+nums[i];
8        }
9        return sum;
10    }
11}