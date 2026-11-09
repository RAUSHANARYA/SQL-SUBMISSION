# Rotate Image

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `n x n` 2D `matrix` representing an image, rotate the image by  **90**  degrees (clockwise).

You have to rotate the image  **in-place**, which means you have to modify the input 2D matrix directly.  **DO NOT**  allocate another 2D matrix and do the rotation.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

```

 **Example 2:** 

```
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

```

 

 **Constraints:** 

- n == matrix.length == matrix[i].length
- 1 <= n <= 20
- -1000 <= matrix[i][j] <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 97.91%)  
**Submitted:** 2026-11-09T16:24:43.095Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-image/)