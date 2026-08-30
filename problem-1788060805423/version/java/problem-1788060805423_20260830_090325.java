// Last updated: 8/30/2026, 9:03:25 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Set<Integer>seen=new HashSet<>();
4        Set<Integer>bad=new HashSet<>();
5        int prev=nums[0];
6        for(int i=1;i<nums.length;i++)
7            {
8                if(nums[i]!=prev)
9                {
10                    if(seen.contains(nums[i]))
11                    {
12                        bad.add(nums[i]);
13                    }
14                    seen.add(prev);
15                    prev=nums[i];
16                }
17            }
18        seen.add(prev);
19        seen.removeAll(bad);
20        return seen.size();
21    }
22}