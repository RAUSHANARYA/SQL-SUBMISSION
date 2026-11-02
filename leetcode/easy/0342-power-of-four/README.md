# Power of Four

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *`true` if it is a power of four. Otherwise, return `false`*.

An integer `n` is a power of four, if there exists an integer `x` such that `n == 4x`.

 

 **Example 1:** 

```
Input: n = 16
Output: true

```

 **Example 2:** 

```
Input: n = 5
Output: false

```

 **Example 3:** 

```
Input: n = 1
Output: true

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

 

 **Follow up:**  Could you solve it without loops/recursion?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 92.20%)  
**Memory:** 42.1 MB (beats 89.46%)  
**Submitted:** 2026-11-02T13:45:17.563Z  

```java
class Solution {
    public boolean isPowerOfFour(int n) 
    {
        // if(n==2||n==8 ||n==12) return false;
        return n>0 && (n & (n-1))==0 && n%3==1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-four/)