// Last updated: 9/11/2026, 9:22:31 AM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int rs=time%(n-1);
        return cycle%2==0?rs+1:n-rs;
    }
}