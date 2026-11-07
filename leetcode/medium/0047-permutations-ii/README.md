# Permutations II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a collection of numbers, `nums`, that might contain duplicates, return  *all possible unique permutations  **in any order**.* 

 

 **Example 1:** 

```
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]

```

 **Example 2:** 

```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 8
- -10 <= nums[i] <= 10

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 93.96%)  
**Memory:** 46.1 MB (beats 91.93%)  
**Submitted:** 2026-11-07T17:00:58.707Z  

```java
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, path, used, ans);

        return ans;
    }

    void backtrack(int[] nums, List<Integer> path,
                   boolean[] used, List<List<Integer>> ans) {

        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Skip already used elements
            if (used[i]) {
                continue;
            }

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // Choose
            path.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, path, used, ans);

            // Undo
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutations-ii/)