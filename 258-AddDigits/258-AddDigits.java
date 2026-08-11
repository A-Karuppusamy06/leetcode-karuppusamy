// Last updated: 8/11/2026, 6:34:56 PM
class Solution {
    public int addDigits(int num) {
        int sum=0,d;
    while(num>9)
    {
    sum=0;
    while(num!=0){
        d=num%10;
        sum=sum+d;
        num=num/10;
    }
    num=sum;
    }
    return num;
    }
}