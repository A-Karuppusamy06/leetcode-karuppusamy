// Last updated: 9/29/2026, 2:28:17 PM
1class Solution {
2    public String reverseWords(String s) {
3    
4        String[] words = s.split(" ");
5        StringBuilder result = new StringBuilder();
6        for (String word : words) {
7            StringBuilder reversedWord = new StringBuilder(word).reverse();
8            result.append(reversedWord).append(" ");
9        }
10        result.deleteCharAt(result.length() - 1);  
11    
12        return result.toString();        
13    }
14}