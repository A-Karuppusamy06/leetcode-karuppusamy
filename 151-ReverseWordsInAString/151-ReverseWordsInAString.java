// Last updated: 8/11/2026, 6:36:40 PM
class Solution {
    public String reverseWords(String s) {
     
        String[] str = s.trim().split("\\s+");

        
        String out = "";

       
        for (int i = str.length - 1; i > 0; i--) {
     
            out += str[i] + " ";
        }
        return out + str[0];
    }
}