# Kth Largest Sum in a Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `root` of a binary tree and a positive integer `k`.

The  **level sum**  in the tree is the sum of the values of the nodes that are on the  **same**  level.

Return *the* `kth` ***largest**  level sum in the tree (not necessarily distinct)*. If there are fewer than `k` levels in the tree, return `-1`.

 **Note**  that two nodes are on the same level if they have the same distance from the root.

 

 **Example 1:** 

```
Input: root = [5,8,9,2,1,3,7,4,6], k = 2
Output: 13
Explanation: The level sums are the following:
- Level 1: 5.
- Level 2: 8 + 9 = 17.
- Level 3: 2 + 1 + 3 + 7 = 13.
- Level 4: 4 + 6 = 10.
The 2nd largest level sum is 13.

```

 **Example 2:** 

```
Input: root = [1,2,null,3], k = 1
Output: 3
Explanation: The largest level sum is 3.

```

 

 **Constraints:** 

- The number of nodes in the tree is n.
- 2 <= n <= 105
- 1 <= Node.val <= 106
- 1 <= k <= n

## Solution

**Language:** Java  
**Runtime:** 69 ms (beats 23.46%)  
**Memory:** 142.8 MB (beats 53.24%)  
**Submitted:** 2026-11-08T22:21:20.282Z  

```java
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Long> levelSums = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            long sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode curr = queue.poll();

                sum += curr.val;

                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            levelSums.add(sum);
        }

        if (levelSums.size() < k) {
            return -1;
        }

        Collections.sort(levelSums, Collections.reverseOrder());

        return levelSums.get(k - 1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/)