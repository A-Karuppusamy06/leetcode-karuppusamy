// Last updated: 9/11/2026, 9:23:47 AM
class Solution {
    public int tribonacci(int n) {
        int f,n1,n2,n3,i;
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        n1=0;n2=1;n3=1;
        for(i=3;i<=n;i++){
            f=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=f;
        }
        return n3;
    }
}