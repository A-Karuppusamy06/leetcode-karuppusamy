// Last updated: 9/11/2026, 9:21:10 AM
class Solution {
    public boolean isPalindromic(String s) {
       StringBuilder binary=new StringBuilder();
        for(char c:s.toCharArray())
            {
                String b=String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
                binary.append(b);
            }
        String str=binary.toString();
        String rev=binary.reverse().toString();
        return str.equals(rev);
    }
}