// Last updated: 8/11/2026, 6:31:41 PM
class Solution {
    public String truncateSentence(String s, int k) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)==' ')
            {
                c++;
                if(c==k)
                {
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}