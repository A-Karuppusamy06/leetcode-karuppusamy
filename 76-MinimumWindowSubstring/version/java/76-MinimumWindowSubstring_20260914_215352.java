// Last updated: 9/14/2026, 9:53:52 PM
1class Solution {
2    public String minWindow(String str, String t) {
3        int[] freqt = new int[128];
4        int[] freqs = new int[128];
5        int m = 0;
6        for(char ch:t.toCharArray()){
7            if(freqt[ch] == 0)++m;
8            freqt[ch]++;
9        }
10        char[] s = str.toCharArray();
11        int n = s.length;
12        int minWindow = Integer.MAX_VALUE;
13        int start = -1 , end = -1;
14        int left = 0;
15        for(int right = 0 ; right < n ; ++right){
16            char chs = s[right];
17            freqs[chs]++;
18            if(freqs[chs] == freqt[chs])--m;
19            while(m == 0 && left <= right){
20                if(right - left + 1 < minWindow){
21                    minWindow = right - left+1;
22                    start = left;
23                    end = right + 1;
24                }
25                char chl = s[left++];
26                freqs[chl]--;
27                if(freqs[chl] < freqt[chl])++m;
28            }
29        }
30        return minWindow == Integer.MAX_VALUE ? "" : str.substring(start,end);
31    }
32}