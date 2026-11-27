# Search in Rotated Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is an integer array `nums` sorted in ascending order (with  **distinct**  values).

Prior to being passed to your function, `nums` is  **possibly left rotated**  at an unknown index `k` (`1 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1],..., nums[n-1], nums[0], nums[1],..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,5,6,7]` might be left rotated by `3` indices and become `[4,5,6,7,0,1,2]`.

Given the array `nums`  **after**  the possible rotation and an integer `target`, return  *the index of* `target` *if it is in* `nums` *, or* `-1` *if it is not in* `nums`.

You must write an algorithm with `O(log n)` runtime complexity.

 

Original
Java
 **Example 1:** 

```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

```

 **Example 2:** 

```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

```

 **Example 3:** 

```
Input: nums = [1], target = 0
Output: -1

```

 

 **Constraints:** 

- 1 <= nums.length <= 5000
- -104 <= nums[i] <= 104
- All values of nums are unique.
- nums is an ascending array that is possibly rotated.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 96.88%)  
**Submitted:** 2026-11-27T15:22:05.920Z  

```java
// class Solution {
//     public int search(int[] nums, int target) 
//     {
//        int i =0;
//        while(i<nums.length-1 && nums[i]<=nums[i+1]) 
//        {
//         i++;
//        }
       
//        int left = check(nums , 0 , i , target );
//        if(left!=-1) return left;
      
//        return check (nums , i+1 , nums.length-1 , target);
//     }

//     private int check (int arr[] , int s , int e , int target)
//     {
//         while(s<=e)
//         {
//             int mid = s+(e-s)/2;
//            if(arr[mid]== target)
//            {
//             return mid;
//            }
//         else if(arr[mid]<target)
//         {
//             s = mid+1;
//         }
//         else
//         {
//             e = mid-1;
//         }
//       }
//       return -1;
//     }
    
// }

class Solution {
    public int search(int[] nums, int target) 
    {
        int n = nums.length;
        int s =0; int e = n-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;

            if(nums[mid]==target) return mid;

            if(nums[mid]>=nums[s])    // if 7>4 left sorted check in left 
            {
              if(nums[mid]>target && target>=nums[s])  //7>0 && 0>4
              {
                 e = mid-1;
              } 
              else
              {
               s=mid+1;
              }
            }
            else                  // right half 
            {
               if(nums[mid]<target && target<=nums[e])
               {
                s=mid+1;
               }
               else
               {
                e = mid-1;
               }
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/)