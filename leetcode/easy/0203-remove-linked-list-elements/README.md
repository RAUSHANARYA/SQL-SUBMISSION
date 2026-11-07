# Remove Linked List Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return  *the new head*.

 

 **Example 1:** 

```
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

```

 **Example 2:** 

```
Input: head = [], val = 1
Output: []

```

 **Example 3:** 

```
Input: head = [7,7,7,7], val = 7
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 104].
- 1 <= Node.val <= 50
- 0 <= val <= 50

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 97.18%)  
**Memory:** 46.8 MB (beats 88.72%)  
**Submitted:** 2026-11-07T15:12:49.829Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val)
     {
       
        while(head != null && head.val == val)
        {
           head = head.next;
        }
         if(head==null) return null;
        ListNode cuNode = head;
        while(cuNode.next!=null )
        {
            if( cuNode.next.val==val)
            {
                 cuNode.next = cuNode.next.next;
            }
            else
            {
              cuNode=cuNode.next;
            }
            
        }
        return head;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-linked-list-elements/)