// Last updated: 8/11/2026, 6:12:29 PM
1class Solution {
2    public String reverseWords(String s) {
3     
4        String[] str = s.trim().split("\\s+");
5
6        
7        String out = "";
8
9       
10        for (int i = str.length - 1; i > 0; i--) {
11     
12            out += str[i] + " ";
13        }
14        return out + str[0];
15    }
16}