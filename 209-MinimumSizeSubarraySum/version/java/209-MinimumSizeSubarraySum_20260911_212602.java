// Last updated: 9/11/2026, 9:26:02 PM
1class Solution {
2    public int minSubArrayLen(int s, int[] a) {
3  if (a == null || a.length == 0)
4    return 0;
5  
6  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
7  
8  while (j < a.length) {
9    sum += a[j++];
10    
11    while (sum >= s) {
12      min = Math.min(min, j - i);
13      sum -= a[i++];
14    }
15  }
16  
17  return min == Integer.MAX_VALUE ? 0 : min;
18}
19}