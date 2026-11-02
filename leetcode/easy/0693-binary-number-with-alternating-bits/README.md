# Binary Number with Alternating Bits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

 

 **Example 1:** 

```
Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101

```

 **Example 2:** 

```
Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.
```

 **Example 3:** 

```
Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
```

 

 **Constraints:** 

- 1 <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.9 MB (beats 68.12%)  
**Submitted:** 2026-11-02T14:12:57.329Z  

```java
class Solution {
    public boolean hasAlternatingBits(int n) {

        // String s = Integer.toBinaryString(n);

        // for(int i = 0; i < s.length() - 1; i++) {

        //     if(s.charAt(i) == s.charAt(i + 1)) {
        //         return false;
        //     }
        // }

        // return true;
        int x = n^(n>>1) ; // 5^ (5/2)==7 
        return (x&(x+1))==0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-number-with-alternating-bits/)