// Last updated: 9/11/2026, 9:21:08 AM
class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int half=n/2;
        long total=0;
        for(int x:nums)
            {
                total+=x;
            }
        long sum=0;
        for(int i=0;i<half;i++)
        {
            sum+=nums[i];
        }
        int ans=0;
        for(int r=0;r<n;r++)
        {
            if(sum>total-sum)
            {
                ans++;
            }
            sum-=nums[r];
            sum+=nums[(r+half)%n];
        }
        return ans;
    }
}