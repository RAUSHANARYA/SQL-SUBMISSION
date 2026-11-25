# Third Maximum Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

Return the  **third distinct maximum**  number in this array. If the third  **maximum**  does not exist, return the  **maximum**  number.

 

Original
Java
 **Example 1:** 

```
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

```

 **Example 2:** 

```
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

```

 **Example 3:** 

```
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Can you find an `O(n)` solution?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.36%)  
**Memory:** 44.2 MB (beats 86.22%)  
**Submitted:** 2026-11-25T14:26:58.269Z  

```java
class Solution {
    public int thirdMax(int[] nums) 
    {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // HashSet<Integer> set = new HashSet<>();
        // int max = nums[0];

        // for(int i:nums)
        // {
        //     max = Math.max(max,i);
        //     if(set.contains(i)) continue;
        //     set.add(i);
        //     pq.offer(i);
        //     if(pq.size()>3) pq.poll();
          
        // }
        // if(pq.size()<3) return max;
        // return pq.peek();

         long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            // Ignore duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            // Case 1: Current number is maximum
            if (num > first) {
                third = second;
                second = first;
                first = num;
            }

            // Case 2: Current number is second maximum
            else if (num > second) {
                third = second;
                second = num;
            }

            // Case 3: Current number is third maximum
            else if (num > third) {
                third = num;
            }
        }

        // If third maximum does not exist
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }

        return (int) third;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/third-maximum-number/)