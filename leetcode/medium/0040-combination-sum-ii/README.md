# Combination Sum II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a collection of candidate numbers (`candidates`) and a target number (`target`), find all unique combinations in `candidates` where the candidate numbers sum to `target`.

Each number in `candidates` may only be used  **once**  in the combination.

 **Note:**  The solution set must not contain duplicate combinations.

 

 **Example 1:** 

```
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

```

 **Example 2:** 

```
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]

```

 

 **Constraints:** 

- 1 <= candidates.length <= 100
- 1 <= candidates[i] <= 50
- 1 <= target <= 30

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 33.88%)  
**Memory:** 49.8 MB (beats 6.32%)  
**Submitted:** 2026-11-04T13:53:05.144Z  

```java
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(0, candidates, target, path, ans);

        return ans;
    }
      void backtrack(int i, int[] arr, int target,
                   List<Integer> path, List<List<Integer>> ans) {

        if(target==0)
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        if(i==arr.length) return;

        //take
        if(arr[i]<=target)
        {
            path.add(arr[i]);
            backtrack(i+1,arr,target-arr[i],path,ans);

            path.remove(path.size()-1);
        }
        int next=i+1;
        while(next<arr.length&&arr[next]==arr[i])
        {
            next++;
        }
        backtrack(next,arr,target,path,ans);


  }
}
```

---

[View on LeetCode](https://leetcode.com/problems/combination-sum-ii/)