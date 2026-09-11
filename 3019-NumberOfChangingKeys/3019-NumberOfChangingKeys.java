// Last updated: 9/11/2026, 9:21:40 AM
class Solution {
    public int countKeyChanges(String s) {
     s=s.toLowerCase();   
     int c=0;
     for(int i=1;i<s.length();i++)
     {
        if(s.charAt(i)!=s.charAt(i-1))
        {
            c++;
        }
     }
     return c;
    }
}