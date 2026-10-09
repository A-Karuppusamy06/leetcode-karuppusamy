// Last updated: 10/9/2026, 10:33:46 AM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] res=new char[s.length()];
4        int i=0;
5        for(int n:indices)  res[n]=s.charAt(i++);
6        return new String(res);
7    }
8}