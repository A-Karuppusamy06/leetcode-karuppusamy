// Last updated: 9/11/2026, 8:09:33 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) return x;
4
5        int left = 1, right = x / 2;
6        int ans = 0;
7
8        while (left <= right) {
9            int mid = left + (right - left) / 2;
10            long sq = (long) mid * mid;
11
12            if (sq == x) {
13                return mid;
14            } else if (sq < x) {
15                ans = mid;
16                left = mid + 1;
17            } else {
18                right = mid - 1;
19            }
20        }
21        return ans;
22    }
23}