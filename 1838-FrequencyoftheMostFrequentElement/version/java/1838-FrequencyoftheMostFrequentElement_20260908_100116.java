// Last updated: 9/8/2026, 10:01:16 AM
1class Solution {
2        public int maxFrequency(int[] A, long k) {
3        int i = 0, j;
4        Arrays.sort(A);
5        for (j = 0; j < A.length; ++j) {
6            k += A[j];
7            if (k < (long)A[j] * (j - i + 1))
8                k -= A[i++];
9        }
10        return j - i;
11    }
12}