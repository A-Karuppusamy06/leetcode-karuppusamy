// Last updated: 8/11/2026, 6:30:09 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            long sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(firstDigit(sum)==x&&sum%10==x)
                    a++;
            }
        }
        return a;
    }
    int firstDigit(long n)
    {
        while(n>=10)
            n/=10;
        return (int)n;
    }
}