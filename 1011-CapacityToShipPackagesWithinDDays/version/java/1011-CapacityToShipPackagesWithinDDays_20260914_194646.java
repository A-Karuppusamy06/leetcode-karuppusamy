// Last updated: 9/14/2026, 7:46:46 PM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int low = 0;
4        int high = 0;
5        for ( int w : weights){
6           low = Math.max(low,w);
7           high+=w;
8        }
9
10        while (low < high){
11            int mid= ( low + high)/2;
12            int dayNeed=1, currWeight=0;
13
14            for (int w : weights){
15                if ( currWeight + w > mid ){
16                    dayNeed++;
17                    currWeight = 0;
18                }
19                currWeight += w;
20            }
21            if ( dayNeed > days){
22                low= mid +1 ;
23            }else {
24                high = mid ;
25            }
26
27        }
28        return low;
29        
30    }
31}