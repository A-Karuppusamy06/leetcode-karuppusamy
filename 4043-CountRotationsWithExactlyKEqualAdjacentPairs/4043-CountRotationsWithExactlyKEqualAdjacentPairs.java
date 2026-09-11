// Last updated: 9/11/2026, 9:21:12 AM
class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int c=0;
        for(int r=0;r<n;r++)
        {
            String t=s.substring(r)+s.substring(0,r);
            int score=0;
            for(int i=0;i<n-1;i++)
            {
                if(t.charAt(i)==t.charAt(i+1))
                
                {
                    score++;
                }
            }
            if(score==k)
            {

                c++;
            }
        }
        return c;
        
    }
}