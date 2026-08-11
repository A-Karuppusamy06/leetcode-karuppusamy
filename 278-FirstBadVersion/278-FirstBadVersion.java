// Last updated: 8/11/2026, 6:04:08 PM
1
2  
3public class Solution extends VersionControl {
4    public int firstBadVersion(int n) {
5        int l = 1;
6        int r = n;
7
8        while (l <= r) {
9            int m = l + (r - l) / 2;
10
11            if (isBadVersion(m)) {
12               
13                r = m - 1;
14            } else {
15               
16                l = m + 1;
17            }
18        }
19
20        return l;
21    }
22}
23