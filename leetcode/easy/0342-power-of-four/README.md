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
**Runtime:** 0 ms  
**Memory:** 41.5 MB  
**Submitted:** 2026-11-02T13:40:42.021Z  

```java
class Solution {
    public boolean isPowerOfFour(int n) 
    {
        if(n==2) return false;
        return n>0 && (n & (n-1))==0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-four/)