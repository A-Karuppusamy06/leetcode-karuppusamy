// Last updated: 9/15/2026, 10:12:32 AM
1class Solution {
2     public boolean checkStraightLine(int[][] coordinates) {
3        int x0 = coordinates[0][0], y0 = coordinates[0][1], 
4            x1 = coordinates[1][0], y1 = coordinates[1][1];
5        int dx = x1 - x0, dy = y1 - y0;
6        for (int[] co : coordinates) {
7            int x = co[0], y = co[1];
8            if (dx * (y - y1) != dy * (x - x1))
9                return false;
10        }
11        return true;
12    }
13}