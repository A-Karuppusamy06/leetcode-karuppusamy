// Last updated: 8/11/2026, 6:31:16 PM
class Solution {
    private static final int MOD = 1_000_000_007;

    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        // dp[i][j][r] = number of ways to reach (i,j) with sum % k == r
        int[][][] dp = new int[m][n][k];

        dp[0][0][grid[0][0] % k] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int r = 0; r < k; r++) {
                    if (dp[i][j][r] == 0) continue;
                    int newR;

                    // move down
                    if (i + 1 < m) {
                        newR = (r + grid[i + 1][j]) % k;
                        dp[i + 1][j][newR] = (dp[i + 1][j][newR] + dp[i][j][r]) % MOD;
                    }

                    // move right
                    if (j + 1 < n) {
                        newR = (r + grid[i][j + 1]) % k;
                        dp[i][j + 1][newR] = (dp[i][j + 1][newR] + dp[i][j][r]) % MOD;
                    }
                }
            }
        }

        return dp[m - 1][n - 1][0];
    }
}
