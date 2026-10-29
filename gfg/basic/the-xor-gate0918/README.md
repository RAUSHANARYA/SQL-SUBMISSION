# The XOR Gate

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  containing n bits, where each element is either 0 or 1, find the output obtained by applying the XOR (exclusive OR) operation to all the elements of the array from left to right.

 **Examples:** 

```
Input: arr[] = [1, 1, 1, 0]
Output: 1
Explanation:
arr[0] ^ arr[1] = 1 ^ 1 = 0
0 ^ arr[2] = 0 ^ 1 = 1
1 ^ arr[3] = 1 ^ 0 = 1
Hence, the output is 1.
```

```
Input: arr[] = [0, 0, 1, 0]
Output: 1
Explanation:
arr[0] ^ arr[1] = 0 ^ 0 = 0
0 ^ arr[2] = 0 ^ 1 = 1
1 ^ arr[3] = 1 ^ 0 = 1
Hence, the output is 1. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T22:28:48.500Z  

```java
class Solution {
    int findXOR(List<Integer> arr) {
        // code here
        int xor =0;
        for(int x : arr)
        {
            xor^=x;
        }
        return xor;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-xor-gate0918/1)