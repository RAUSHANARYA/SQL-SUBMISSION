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
**Runtime:** 8 ms (beats 17.05%)  
**Memory:** 46.4 MB (beats 9.12%)  
**Submitted:** 2026-11-25T14:24:14.691Z  

```java
class Solution {
    public int thirdMax(int[] nums) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        int max = nums[0];

        for(int i:nums)
        {
            max = Math.max(max,i);
            if(set.contains(i)) continue;
            set.add(i);
            pq.offer(i);
            if(pq.size()>3) pq.poll();
          
        }
        if(pq.size()<3) return max;
        return pq.peek();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/third-maximum-number/)