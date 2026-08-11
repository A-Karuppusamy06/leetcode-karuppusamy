// Last updated: 8/11/2026, 6:37:30 PM
class Solution {
    int[][] memo;

    int fun(int i, int j, int m, int n) {
        // Base case: Reached the destination
        if (i == m - 1 && j == n - 1) return 1; 
        
        // Out of bounds
        if (j >= n || i >= m) return 0; 
        
        // Return cached result if available
        if (memo[i][j] != -1) return memo[i][j];

        // Store and return the result
        return memo[i][j] = fun(i, j + 1, m, n) + fun(i + 1, j, m, n); 
    }

    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            java.util.Arrays.fill(memo[i], -1);
        }
        return fun(0, 0, m, n); 
    }
}