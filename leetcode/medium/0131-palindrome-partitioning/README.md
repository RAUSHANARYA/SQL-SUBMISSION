# Palindrome Partitioning

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, partition `s` such that every substring of the partition is a  **palindrome**. Return  *all possible palindrome partitioning of* `s`.

 

Original
Java
 **Example 1:** 

```
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

```

 **Example 2:** 

```
Input: s = "a"
Output: [["a"]]

```

 

 **Constraints:** 

- 1 <= s.length <= 16
- s contains only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 75.91%)  
**Memory:** 64.7 MB (beats 88.55%)  
**Submitted:** 2026-11-12T20:13:48.704Z  

```java
class Solution {
List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s)
    {
        backtrack(0,s,new ArrayList<>());
        return ans;
    }
    private void backtrack(int i, String s , List<String>curr)
    {
        if(i==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int j =i;j<s.length();j++)
        {
            String str = s.substring(i,j+1);
            
           if(palindrome(str))
           {
            curr.add(str);
            backtrack(j+1,s,curr);
            curr.remove(curr.size()-1);
           }
        
        }
    }
    private boolean palindrome(String str)
    {
        int left =0;
        int right = str.length()-1;
        while(left<right)
        {
           if( str.charAt(left)!=str.charAt(right)) return false;
            left++;
        right--;
        }
       return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-partitioning/)