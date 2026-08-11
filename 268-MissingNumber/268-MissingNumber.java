// Last updated: 8/11/2026, 6:34:49 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,n,x;
        n=nums.length;
        for(int i=0;i<n;i++)
            sum=sum+nums[i];
        n=(n*(n+1)/2);
        return n-sum;
    }
}