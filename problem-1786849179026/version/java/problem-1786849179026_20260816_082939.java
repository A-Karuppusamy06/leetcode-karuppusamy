// Last updated: 8/16/2026, 8:29:39 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int max=0;
4        for(int light:lights)
5            {
6                max=Math.max(max,light);
7            }
8        int ans=0;
9        for(int time:arrivalTime)
10            {
11                int r=time%period;
12                int wait;
13                if(r<max)
14                {
15                    wait=0;
16                }
17                else
18                {
19                    wait=period-r;
20                }
21                ans=Math.max(ans,wait);
22            }
23        return ans;
24    }
25}