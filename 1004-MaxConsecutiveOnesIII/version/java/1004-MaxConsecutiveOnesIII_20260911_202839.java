// Last updated: 9/11/2026, 8:28:39 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int start=0;
4        int end=0;
5        int zeros=0;
6
7        while(end<nums.length){
8            if(nums[end] == 0){
9                zeros++;
10            }
11            end++;
12            if(zeros>k){
13                if(nums[start] == 0){
14                    zeros--;
15                }
16                start++;
17            }
18        }
19        return end-start;
20    }
21}