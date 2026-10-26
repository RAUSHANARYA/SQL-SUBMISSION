# Word Search

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` grid of characters `board` and a string `word`, return `true`  *if*  `word`  *exists in the grid*.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

 **Example 1:** 

```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

```

 **Example 2:** 

```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

```

 **Example 3:** 

```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false

```

 

 **Constraints:** 

- m == board.length
- n = board[i].length
- 1 <= m, n <= 6
- 1 <= word.length <= 15
- board and word consists of only lowercase and uppercase English letters.

 

 **Follow up:**  Could you use search pruning to make your solution faster with a larger `board`?

## Solution

**Language:** Java  
**Runtime:** 264 ms (beats 9.67%)  
**Memory:** 46.4 MB (beats 14.15%)  
**Submitted:** 2026-10-26T15:16:45.371Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/word-search/)