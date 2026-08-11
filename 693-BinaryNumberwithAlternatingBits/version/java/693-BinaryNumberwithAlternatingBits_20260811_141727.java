// Last updated: 8/11/2026, 2:17:27 PM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int x = n ^ (n >> 1);
4        return (x & (x + 1)) == 0;
5    }
6}