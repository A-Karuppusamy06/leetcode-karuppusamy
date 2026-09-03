// Last updated: 9/3/2026, 9:47:16 AM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3
4        int low = 1;
5        int high = 0;
6
7       
8        for (int pile : piles) {
9            high = Math.max(high, pile);
10        }
11
12        while (low < high) {
13
14            int mid = low + (high - low) / 2;
15
16            long hours = 0;
17
18            for (int pile : piles) {
19                hours += (pile + mid - 1) / mid;
20            }
21
22            if (hours <= h) {
23                high = mid;
24            } else {
25                low = mid + 1;
26            }
27        }
28
29        return low;
30    }
31}