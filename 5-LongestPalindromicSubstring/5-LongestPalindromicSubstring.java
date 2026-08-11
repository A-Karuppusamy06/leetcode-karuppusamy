// Last updated: 8/11/2026, 6:11:40 PM
1class Solution {
2    int maxLen = 0;
3    int lo = 0;
4    public String longestPalindrome(String s) {
5        char[] input = s.toCharArray();
6        if(s.length() < 2) {
7            return s;
8        }
9        
10        for(int i = 0; i<input.length; i++) {
11            expandPalindrome(input, i, i);
12            expandPalindrome(input, i, i+1);
13        }
14        return s.substring(lo, lo+maxLen);
15    }
16    
17    public void expandPalindrome(char[] s, int j, int k) {
18        while(j >= 0 && k < s.length && s[j] == s[k]) {
19            j--;
20            k++;
21        }
22        if(maxLen < k - j - 1) {
23            maxLen = k - j - 1;
24            lo = j+1;
25        }
26    }
27}