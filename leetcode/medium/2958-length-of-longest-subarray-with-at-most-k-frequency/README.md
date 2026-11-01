# Length of Longest Subarray With at Most K Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and an integer `k`.

The  **frequency**  of an element `x` is the number of times it occurs in an array.

An array is called  **good**  if the frequency of each element in this array is  **less than or equal**  to `k`.

Return  *the length of the  **longest**   **good**  subarray of*  `nums` *.* 

A  **subarray**  is a contiguous non-empty sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1,2,3,1,2], k = 2
Output: 6
Explanation: The longest possible good subarray is [1,2,3,1,2,3] since the values 1, 2, and 3 occur at most twice in this subarray. Note that the subarrays [2,3,1,2,3,1] and [3,1,2,3,1,2] are also good.
It can be shown that there are no good subarrays with length more than 6.

```

 **Example 2:** 

```
Input: nums = [1,2,1,2,1,2,1,2], k = 1
Output: 2
Explanation: The longest possible good subarray is [1,2] since the values 1 and 2 occur at most once in this subarray. Note that the subarray [2,1] is also good.
It can be shown that there are no good subarrays with length more than 2.

```

 **Example 3:** 

```
Input: nums = [5,5,5,5,5,5,5], k = 4
Output: 4
Explanation: The longest possible good subarray is [5,5,5,5] since the value 5 occurs 4 times in this subarray.
It can be shown that there are no good subarrays with length more than 4.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 109
- 1 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 79 ms (beats 11.11%)  
**Memory:** 88.3 MB (beats 89.16%)  
**Submitted:** 2026-11-01T23:42:38.670Z  

```java


class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(r < n)
        {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // If frequency exceeds k, shrink the window
            while(map.get(nums[r]) > k)
            {
                map.put(nums[l], map.get(nums[l]) - 1);

                if(map.get(nums[l]) == 0)
                    map.remove(nums[l]);

                l++;
            }

            // Calculate maximum valid window length
            maxLen = Math.max(maxLen, r-l+1);

            r++;
        }

        return maxLen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/)