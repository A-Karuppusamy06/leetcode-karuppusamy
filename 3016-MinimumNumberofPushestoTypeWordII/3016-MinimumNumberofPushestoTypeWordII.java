// Last updated: 8/11/2026, 6:21:53 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4
5        for (char ch : word.toCharArray()) {
6            freq[ch - 'a']++;
7        }
8
9        int ans = 0;
10        int assigned = 0;
11
12        while (true) {
13            int mx = 0;
14            int idx = -1;
15
16            for (int i = 0; i < 26; i++) {
17                if (freq[i] > mx) {
18                    mx = freq[i];
19                    idx = i;
20                }
21            }
22
23            if (idx == -1) {
24                break;
25            }
26
27            ans += mx * (assigned / 8 + 1);
28            freq[idx] = 0;
29            assigned++;
30        }
31
32        return ans;
33    }
34}