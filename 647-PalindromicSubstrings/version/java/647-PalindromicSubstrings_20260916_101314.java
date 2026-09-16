// Last updated: 9/16/2026, 10:13:14 AM
1class Solution {
2    public int countSubstrings(String s) {
3        int count = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            count += expand(s, i, i);
7            count += expand(s, i, i + 1);
8        }
9        return count;
10    }
11
12    private int expand(String s, int left, int right) {
13        int count = 0;
14        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
15            count++;
16            left--;
17            right++;
18        }
19        return count;
20    }
21}