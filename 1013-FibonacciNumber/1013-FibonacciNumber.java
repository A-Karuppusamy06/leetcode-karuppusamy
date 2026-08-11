// Last updated: 8/11/2026, 6:32:37 PM
class Solution {
    public int fib(int n) {
        int f,n1,n2,i;
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        n1=0;
        n2=1;
        for(i=2;i<=n;i++){
            f=n1+n2;
            n1=n2;
            n2=f;
        }
        return n2;    
    }
}