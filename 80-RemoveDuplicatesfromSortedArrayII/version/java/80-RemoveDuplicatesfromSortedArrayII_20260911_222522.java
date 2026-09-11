// Last updated: 9/11/2026, 10:25:22 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        if(n<=2){
5            return n;
6        }
7
8        int j = 2;
9        for(int i=2; i<n; i++){
10            if(nums[i] != nums[j-2]){
11                nums[j] = nums[i];
12                j++;
13            }
14        }
15        return j;
16    }
17}