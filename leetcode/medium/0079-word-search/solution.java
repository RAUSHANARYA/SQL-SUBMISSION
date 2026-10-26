
class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        if (n == 0 || board[0].length == 0) return false;

        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, 0, word, visited))
                        return true;
                }
            }
        }

        return false;
    }

    boolean dfs(char[][] board, int row, int col,
                int indx, String word, boolean[][] visited) {

        int n = board.length;
        int m = board[0].length;

        if (board[row][col] != word.charAt(indx))
            return false;

        if (indx == word.length() - 1)
            return true;

        visited[row][col] = true;

        int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};

        for (int[] d : dir) {
            int ni = row + d[0];
            int nj = col + d[1];

            if (ni >= 0 && nj >= 0 && ni < n && nj < m
                    && !visited[ni][nj]) {

                if (dfs(board, ni, nj, indx + 1,
                        word, visited)) {
                    visited[row][col] = false;
                    return true;
                }
            }
        }

        visited[row][col] = false; // Backtracking
        return false;
    }
}
