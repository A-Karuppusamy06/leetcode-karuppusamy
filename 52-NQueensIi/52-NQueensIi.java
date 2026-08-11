// Last updated: 8/11/2026, 6:37:41 PM
class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        solve(0, board, n);
        return count;
    }

    void solve(int row, char[][] board, int n) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, n);
                board[row][col] = '.';
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }
}