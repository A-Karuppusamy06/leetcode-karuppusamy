// Last updated: 8/11/2026, 6:34:26 PM
class Solution {
    public void reverseString(char[] s) {
    int st=0,e=s.length-1;
    while(st<e)
    {
        char temp=s[st];
        s[st]=s[e];
        s[e]=temp;
        st++;
        e--;
    }
    for(int i=0;i<s.length;i++)
    System.out.print(s[i]);
    }
}