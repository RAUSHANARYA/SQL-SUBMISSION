# Subsets II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` that may contain duplicates, return  *all possible*   *subsets** (the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

 **Example 1:** 

```
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 60.70%)  
**Memory:** 44.9 MB (beats 70.92%)  
**Submitted:** 2026-11-03T14:28:24.889Z  

```java
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums)
     {
        Arrays.sort(nums);
         List<Integer>path = new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        backtrack(nums,0,path,ans);

        return ans;
    }
    void backtrack(int[]arr,int i, List<Integer>path,  List<List<Integer>> ans)
    {
        
        //base case
        if(i==arr.length)
        {
            ans.add(new ArrayList<>(path));
            return;
        } 
     
    // Take
    path.add(arr[i]);
    backtrack(arr, i + 1, path, ans);

    // Backtrack
    path.remove(path.size() - 1);
    
    int next =i+1;
    while(next<arr.length && arr[next]==arr[i])
    {
        next++;
    }
    backtrack(arr, next, path, ans);
    }

}
```

---

[View on LeetCode](https://leetcode.com/problems/subsets-ii/)