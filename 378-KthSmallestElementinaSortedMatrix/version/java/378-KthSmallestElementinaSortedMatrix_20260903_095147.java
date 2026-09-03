// Last updated: 9/3/2026, 9:51:47 AM
1public class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int lo = matrix[0][0], hi = matrix[n - 1][n - 1];
5        while (lo <= hi) {
6            int mid = lo + (hi - lo) / 2;
7            int count = getLessEqual(matrix, mid);
8            if (count < k) lo = mid + 1;
9            else hi = mid - 1;
10        }
11        return lo;
12    }
13    
14    private int getLessEqual(int[][] matrix, int val) {
15        int res = 0;
16        int n = matrix.length, i = n - 1, j = 0;
17        while (i >= 0 && j < n) {
18            if (matrix[i][j] > val) i--;
19            else {
20                res += i + 1;
21                j++;
22            }
23        }
24        return res;
25    }
26}