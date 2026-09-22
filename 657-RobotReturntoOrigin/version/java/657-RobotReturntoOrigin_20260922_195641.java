// Last updated: 9/22/2026, 7:56:41 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0, y = 0;  
4
5        for (char c : moves.toCharArray()) {
6            switch (c) {
7                case 'U': y += 1; break;
8                case 'D': y -= 1; break;
9                case 'L': x -= 1; break;
10                case 'R': x += 1; break;
11            }
12        }
13
14        if (x == 0 && y == 0) {
15            return true;
16        } else {
17            return false;
18        }
19    }
20}