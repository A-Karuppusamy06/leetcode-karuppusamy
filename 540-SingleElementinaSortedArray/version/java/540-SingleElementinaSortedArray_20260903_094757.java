// Last updated: 9/3/2026, 9:47:57 AM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0, right = nums.length-1;
4        while(left < right){
5            int mid = (left + right)/2;
6            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
7                left = mid + 1;
8            else
9                right = mid;
10        }
11        return nums[left];
12    }   
13}