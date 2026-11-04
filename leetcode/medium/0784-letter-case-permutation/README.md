# Letter Case Permutation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, you can transform every letter individually to be lowercase or uppercase to create another string.

Return  *a list of all possible strings we could create*. Return the output in  **any order**.

 

 **Example 1:** 

```
Input: s = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]

```

 **Example 2:** 

```
Input: s = "3z4"
Output: ["3z4","3Z4"]

```

 

 **Constraints:** 

- 1 <= s.length <= 12
- s consists of lowercase English letters, uppercase English letters, and digits.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 61.81%)  
**Memory:** 46.9 MB (beats 87.14%)  
**Submitted:** 2026-11-04T18:57:05.596Z  

```java
class Solution {
    public List<String> letterCasePermutation(String s) {

        List<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();

        backtrack(0, arr, ans);

        return ans;
    }

    void backtrack(int i, char[] arr, List<String> ans) {

        if (i == arr.length) {
            ans.add(new String(arr));
            return;
        }

        // Digit: only one choice
        if (Character.isDigit(arr[i])) {
            backtrack(i + 1, arr, ans);
            return;
        }

        // Take: lowercase
        arr[i] = Character.toLowerCase(arr[i]);
        backtrack(i + 1, arr, ans);

        // Take: uppercase
        arr[i] = Character.toUpperCase(arr[i]);
        backtrack(i + 1, arr, ans);

        // Restore original character
        // Not necessary for correctness here because both cases
        // have been explored, but useful for clean backtracking.
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/letter-case-permutation/)