// Last updated: 8/11/2026, 2:22:58 PM
1class Solution {
2   public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
3    if(a == e && !(a == c && d > Math.min(b,f) && d < Math.max(b,f) )) return 1;
4    if(b == f && !(b == d && c > Math.min(a,e) && c < Math.max(a,e) ))  return 1;
5    if(c + d == e + f && !(c + d == a + b && a > Math.min(c , e) && a < Math.max(c, e) )) return 1;
6    if(c-d == e-f && !( c-d == a-b && a > Math.min(c , e) && a < Math.max(c, e) )) return 1;
7    return 2;
8}
9}