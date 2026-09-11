// Last updated: 9/11/2026, 9:23:19 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int i,n;
        n=nums.length;
        for(i=1;i<n;i++)
            nums[i]=nums[i]+nums[i-1];
        return nums;

        
        
    }
}