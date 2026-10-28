# Nth in Concatenated Decimal String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Consider a string  **s**  formed by concatenating the decimal representations of all positive integers in order:

s = "12345678910111213141516171819202122232425262728293031..."

Given an integer **n**, find the nth character (1-based indexing) in the string s.

 **Examples:** 

```
Input: n = 10
Output: '1'
Explanation: The 10th in "1234567891.." character is '1'.
```

```
Input: n = 11
Output: '0'
Explanation: The 11th character in "12345678910.."  is '0'.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T15:50:40.905Z  

```java
class Solution {
    public char nthCharacter(int n) {
        long digits = 9;
        long start = 1;
        long length = 1;

        // Find which group of numbers contains the nth character
        while (n > digits * length) {
            n -= digits * length;
            digits *= 10;
            start *= 10;
            length++;
        }

        // Find the number containing the character
        long number = start + (n - 1) / length;

        // Find the digit inside that number
        int index = (int) ((n - 1) % length);

        return Long.toString(number).charAt(index);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/nth-character-in-concatenated-decimal-string0245/1)