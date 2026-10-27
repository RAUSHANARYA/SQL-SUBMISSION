
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];

        // Fill all cells with obstacles
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '#';
            }
        }

        // Move right across the first row
        for (int j = 0; j < n; j++) {
            grid[0][j] = '.';
        }

        // Move down along the last column
        for (int i = 1; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        // Convert char[][] into String[]
        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }

        return ans;
    }
}
