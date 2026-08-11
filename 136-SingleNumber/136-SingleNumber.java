// Last updated: 8/11/2026, 6:36:44 PM
class Solution {
    public int singleNumber(int[] nums) {
        int x=0,i;
        for(i=0;i<nums.length;i++)
            
            x=x^nums[i];
        return x;
    }
}