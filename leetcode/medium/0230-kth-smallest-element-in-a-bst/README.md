# Kth Smallest Element in a BST

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary search tree, and an integer `k`, return  *the*  `kth`  *smallest value (**1-indexed**) of all the values of the nodes in the tree*.

 

 **Example 1:** 

```
Input: root = [3,1,4,null,2], k = 1
Output: 1

```

 **Example 2:** 

```
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3

```

 

 **Constraints:** 

- The number of nodes in the tree is n.
- 1 <= k <= n <= 104
- 0 <= Node.val <= 104

 

 **Follow up:**  If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.9 MB (beats 97.88%)  
**Submitted:** 2026-11-08T22:17:19.077Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    int ans=-1;
    public int kthSmallest(TreeNode root, int k)
     {
        inorder(root,k);
        return ans;
    }
    void inorder(TreeNode root, int k)
    {
        if(root==null) return;
        inorder(root.left , k);
        count++;
         
        if(count==k)
        {
            ans=root.val;
            return;
        }

        inorder(root.right,k);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)