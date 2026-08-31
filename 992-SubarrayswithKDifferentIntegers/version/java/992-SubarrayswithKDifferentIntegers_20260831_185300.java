// Last updated: 8/31/2026, 6:53:00 PM
1class Solution {
2        public int subarraysWithKDistinct(int[] A, int K) {
3        return atMostK(A, K) - atMostK(A, K - 1);
4    }
5    int atMostK(int[] A, int K) {
6        int i = 0, res = 0;
7        Map<Integer, Integer> count = new HashMap<>();
8        for (int j = 0; j < A.length; ++j) {
9            if (count.getOrDefault(A[j], 0) == 0) K--;
10            count.put(A[j], count.getOrDefault(A[j], 0) + 1);
11            while (K < 0) {
12                count.put(A[i], count.get(A[i]) - 1);
13                if (count.get(A[i]) == 0) K++;
14                i++;
15            }
16            res += j - i + 1;
17        }
18        return res;
19    }
20}