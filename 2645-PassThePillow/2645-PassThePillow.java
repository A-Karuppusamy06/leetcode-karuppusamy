// Last updated: 8/11/2026, 6:31:07 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int rs=time%(n-1);
        return cycle%2==0?rs+1:n-rs;
    }
}