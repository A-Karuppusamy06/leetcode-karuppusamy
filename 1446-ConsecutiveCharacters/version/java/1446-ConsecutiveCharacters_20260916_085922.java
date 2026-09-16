// Last updated: 9/16/2026, 8:59:22 AM
1class Solution {
2        public int maxPower(String s) {
3        int ans = 1;
4        for (int i = 1, cnt = 1; i < s.length(); ++i) {
5            if (s.charAt(i) == s.charAt(i - 1)) {
6                if (++cnt > ans) {
7                    ans = cnt;
8                }
9            }else {
10                cnt = 1;
11            }
12        }
13        return ans;
14    }
15}