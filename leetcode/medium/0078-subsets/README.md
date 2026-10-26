# Subsets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of  **unique**  elements, return  *all possible*   *subsets*   *(the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10
- All the numbers of nums are unique.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 89.38%)  
**Memory:** 43.7 MB (beats 88.70%)  
**Submitted:** 2026-10-26T15:57:59.234Z  

```java
class Solution {
    public List<List<Integer>> subsets(int[] nums)
     {
        List<Integer>path = new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        backtrack(0,nums,path,ans);

        return ans;
    }
    void  backtrack(int i ,int[]nums,List<Integer>path, List<List<Integer>> ans)
    {
         ans.add(new ArrayList<>(path)); // []

         for(int j =i;j<nums.length;j++)
         {
            path.add(nums[j]); 

            backtrack(j+1,nums,path,ans);

            path.remove(path.size()-1);

         }
    }

}
```

---

[View on LeetCode](https://leetcode.com/problems/subsets/)