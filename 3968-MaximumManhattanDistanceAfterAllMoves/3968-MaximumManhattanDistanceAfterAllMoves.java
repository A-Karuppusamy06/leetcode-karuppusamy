// Last updated: 9/11/2026, 9:21:23 AM
class Solution {
    public int maxDistance(String moves) {
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        int x=0;
        for(char c: moves.toCharArray())
        {
            if(c=='U')
                u++;
            else if(c=='D')
                d++;
            else if(c=='L')
                l++;
            else if(c=='R')
                r++;
            else
                x++;
        }
        return Math.abs(u-d)+Math.abs(l-r)+x;
    }
}