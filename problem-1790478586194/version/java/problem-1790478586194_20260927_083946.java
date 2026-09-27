// Last updated: 9/27/2026, 8:39:46 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3       int n=nums.length;
4        int al=0;
5        long[] pairs=new long[n-1];
6        int k=0;
7        for(int i=0;i<n-1;i++)
8        {
9            if(nums[i]==nums[i+1])
10            {
11                al++;
12            }
13            else
14            {
15                int a=Math.min(nums[i],nums[i+1]);
16                int b=Math.max(nums[i],nums[i+1]);
17                pairs[k++]=((long)a<<32)|(b&0xffffffffL);
18            }
19        }
20        Arrays.sort(pairs,0,k);
21        int max=0;
22        int count=0;
23        for(int i=0;i<k;i++)
24        {
25            if(i==0||pairs[i]==pairs[i-1])
26            {
27                count++;
28            }
29            else
30            {
31                count=1;
32            } 
33            max=Math.max(max,count);
34        }
35        return al+max;
36    }
37}