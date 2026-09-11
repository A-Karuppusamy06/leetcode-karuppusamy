// Last updated: 9/11/2026, 9:49:24 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> list = new ArrayList<>();
4
5        if (p.length() > s.length()) {
6            return list;
7        }
8
9        int[] pFreq = new int[26];
10        int[] windowFreq = new int[26];
11
12        for (int i = 0; i < p.length(); i++) {
13            pFreq[p.charAt(i) - 'a']++;
14        }
15
16        int left = 0;
17
18        for (int right = 0; right < s.length(); right++) {
19            windowFreq[s.charAt(right) - 'a']++;
20
21            if (right - left + 1 > p.length()) {
22                windowFreq[s.charAt(left) - 'a']--;
23                left++;
24            }
25
26            if (right - left + 1 == p.length()) {
27                if (isSame(pFreq, windowFreq)) {
28                    list.add(left);
29                }
30            }
31        }
32
33        return list;
34    }
35
36    public boolean isSame(int[] a, int[] b) {
37        for (int i = 0; i < 26; i++) {
38            if (a[i] != b[i]) {
39                return false;
40            }
41        }
42        return true;
43    }
44}