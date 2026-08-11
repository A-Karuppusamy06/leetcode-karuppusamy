// Last updated: 8/11/2026, 6:34:28 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1)
            return false;
        while(n%4==0)
        {
            n=n/4;
        }
        if(n==1)
            return true;
        else
            return false;
        
    }
}