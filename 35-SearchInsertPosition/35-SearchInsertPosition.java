// Last updated: 8/11/2026, 6:38:03 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length -1;
        while(low<=high){
            int mid=low+high;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
}