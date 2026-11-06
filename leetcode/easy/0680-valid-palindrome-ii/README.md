# Valid Palindrome II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return `true`  *if the* `s` *can be palindrome after deleting  **at most one**  character from it*.

 

 **Example 1:** 

```
Input: s = "aba"
Output: true

```

 **Example 2:** 

```
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

```

 **Example 3:** 

```
Input: s = "abc"
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 22.08%)  
**Memory:** 47.1 MB (beats 94.89%)  
**Submitted:** 2026-11-06T15:29:08.184Z  

```java
class Solution {
    public boolean validPalindrome(String s)
     {
        int l =0;
        int r = s.length()-1;
       while(l<r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return palindrome(l+1, r, s) || palindrome(l, r-1, s);
            }
        }
            return true;

    }
private boolean palindrome( int start , int end,String s )
  {
    while(start<end)
    {
         char ch = s.charAt(start);
         char c = s.charAt(end);

         if(ch!=c)
            {
                return false;
            }
            
            start++;
            end--;

    }
    return true;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)