// Last updated: 9/14/2026, 8:41:34 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int maxSum = nums[0];
4        int minSum = nums[0];
5        int currMaxSum = nums[0];
6        int currMinSum = nums[0];
7        int totalSum = nums[0];
8        
9        for (int i = 1; i < nums.length; i++) {
10          
11            currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
12            maxSum = Math.max(maxSum, currMaxSum);
13          
14            currMinSum = Math.min(currMinSum + nums[i], nums[i]);
15            minSum = Math.min(minSum, currMinSum);
16            
17          
18            totalSum += nums[i];
19        }
20        
21        
22        int circularSum = totalSum - minSum;
23        
24        if (circularSum == 0) {
25            return maxSum;
26        }
27        
28      
29        return Math.max(maxSum, circularSum);
30    }
31}