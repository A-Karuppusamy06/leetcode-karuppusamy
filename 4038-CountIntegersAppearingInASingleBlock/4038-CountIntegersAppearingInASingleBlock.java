// Last updated: 9/11/2026, 9:21:05 AM
class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer>seen=new HashSet<>();
        Set<Integer>bad=new HashSet<>();
        int prev=nums[0];
        for(int i=1;i<nums.length;i++)
            {
                if(nums[i]!=prev)
                {
                    if(seen.contains(nums[i]))
                    {
                        bad.add(nums[i]);
                    }
                    seen.add(prev);
                    prev=nums[i];
                }
            }
        seen.add(prev);
        seen.removeAll(bad);
        return seen.size();
    }
}