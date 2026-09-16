// Last updated: 9/16/2026, 9:33:36 AM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int current = s.length()-1;
4        for (int i=s.length()-1; i>0;i--){
5            for (int j=0; j+i<s.length(); j++){
6                if (s.charAt(j) == s.charAt(j+i)) return i-1;
7            }
8            current--;
9        }
10        return -1;
11    }
12}