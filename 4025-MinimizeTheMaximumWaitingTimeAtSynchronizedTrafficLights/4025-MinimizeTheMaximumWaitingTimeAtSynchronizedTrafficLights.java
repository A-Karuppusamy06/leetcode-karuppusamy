// Last updated: 9/11/2026, 9:21:21 AM
class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max=0;
        for(int light:lights)
            {
                max=Math.max(max,light);
            }
        int ans=0;
        for(int time:arrivalTime)
            {
                int r=time%period;
                int wait;
                if(r<max)
                {
                    wait=0;
                }
                else
                {
                    wait=period-r;
                }
                ans=Math.max(ans,wait);
            }
        return ans;
    }
}