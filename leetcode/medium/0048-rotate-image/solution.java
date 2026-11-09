class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] ans = new int[m][n];

        // Step 1: Transpose
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        // Step 2: Reverse every row
        // for(int i = 0; i < m; i++) {
        //     for(int j = 0; j < n / 2; j++) {
        //         int temp = ans[i][j];
        //         ans[i][j] = ans[i][n - 1 - j];
        //         ans[i][n - 1 - j] = temp;
        //     }
        // }
        int left =0;
        int right = m-1;
        while(left<right)
        {
            for(int i =0;i<n;i++)
            {
               int temp = ans[i][left];
              ans[i][left] =ans[i][right];
              ans[i][right]=temp;
            }
            left++;
            right--;
        }

        // Copy answer back to original matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}