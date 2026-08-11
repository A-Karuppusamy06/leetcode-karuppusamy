// Last updated: 8/11/2026, 6:31:58 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int i,n;
        n=nums.length;
        for(i=1;i<n;i++)
            nums[i]=nums[i]+nums[i-1];
        return nums;

        
        
    }
}