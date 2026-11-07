# Beautiful Arrangement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Suppose you have `n` integers labeled `1` through `n`. A permutation of those `n` integers `perm` (**1-indexed**) is considered a  **beautiful arrangement**  if for every `i` (`1 <= i <= n`),  **either**  of the following is true:

- perm[i] is divisible by i.
- i is divisible by perm[i].

Given an integer `n`, return  *the  **number**  of the  **beautiful arrangements**  that you can construct*.

 

 **Example 1:** 

```
Input: n = 2
Output: 2
Explanation: 
The first beautiful arrangement is [1,2]:
    - perm[1] = 1 is divisible by i = 1
    - perm[2] = 2 is divisible by i = 2
The second beautiful arrangement is [2,1]:
    - perm[1] = 2 is divisible by i = 1
    - i = 2 is divisible by perm[2] = 1

```

 **Example 2:** 

```
Input: n = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= n <= 15

## Solution

**Language:** Java  
**Runtime:** 39 ms (beats 71.61%)  
**Memory:** 41.3 MB (beats 94.23%)  
**Submitted:** 2026-11-07T17:20:01.994Z  

```java
class Solution {
    public int countArrangement(int n) {

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        boolean[] used = new boolean[n];

        return backtrack(nums, used, 1);
    }

    int backtrack(int[] nums, boolean[] used, int pos) {

        // All positions filled
        if (pos > nums.length) {
            return 1;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!used[i]) {

                int num = nums[i];

                if (num % pos == 0 || pos % num == 0) {

                    // Choose
                    used[i] = true;

                    // Explore
                    count += backtrack(nums, used, pos + 1);

                    // Undo
                    used[i] = false;
                }
            }
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/beautiful-arrangement/)