// Last updated: 8/11/2026, 6:31:29 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
     int d,ans=0,res=0,rn,t;
     int temp=num;
     while(num!=0){
        d=num%10;
        ans=ans*10+d;
        num=num/10;
    }
    rn=ans;
    while(rn!=0){
        t=rn%10;
        res=res*10+t;
        rn=rn/10;
    }
    if(temp==res)
        return true;
    else
        return false;
}}