// Last updated: 9/11/2026, 9:23:30 AM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while( num!=0)
        {
        if(num%2==0)
            num=num/2; 
        else  
            num=num-1;
        c++;
        }  
        return c;
    }
}