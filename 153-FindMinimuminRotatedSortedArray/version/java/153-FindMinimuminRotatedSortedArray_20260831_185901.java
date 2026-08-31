// Last updated: 8/31/2026, 6:59:01 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int low=0;
5        int high=nums.length-1;
6
7        while(low<=high)
8        {
9            int mid=low+(high-low)/2;
10
11            if(nums[low]<=nums[mid])
12            {
13                min=Math.min(nums[low],min);
14                low=mid+1;
15            }else{
16                min=Math.min(min,nums[mid]);
17                high=mid-1;
18            }
19        }
20        return min;
21    }
22}