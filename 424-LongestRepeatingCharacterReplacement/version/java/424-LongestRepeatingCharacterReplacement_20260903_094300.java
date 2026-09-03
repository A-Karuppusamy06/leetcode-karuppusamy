// Last updated: 9/3/2026, 9:43:00 AM
1class Solution {
2       public int characterReplacement(String s, int k) {
3        int len = s.length();
4        int[] count = new int[26];
5        int start = 0, maxCount = 0, maxLength = 0;
6        for (int end = 0; end < len; end++) {
7            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
8            while (end - start + 1 - maxCount > k) {
9                count[s.charAt(start) - 'A']--;
10                start++;
11            }
12            maxLength = Math.max(maxLength, end - start + 1);
13        }
14        return maxLength;
15    }
16}