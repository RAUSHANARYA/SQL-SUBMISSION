# Closest Pair Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and a number  **target**, find a pair of elements (a, b) in  **arr[],** where a ≤ b whose sum is closest to  **target.** 

 **Note:** Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

 **Examples:** 

```
Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: As 5 + 20 = 25 is closest to 25.

```

```
Input: arr[] = [5, 2, 7, 1, 4], target = 10
Output: [2, 7]
Explanation: As (4, 5), (2, 7) and (4, 7) both are closest to 10, but absolute difference of (4, 5) is 1, (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
```

```
Input: arr[] = [10], target = 10
Output: []
Explanation: As the input array has only 1 element, return an empty array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T23:23:16.097Z  

```java
import java.util.*;

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;

        if (n < 2) {
            return ans;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        long minDiff = Long.MAX_VALUE;
        long maxPairDiff = Long.MIN_VALUE;

        while (left < right) {

            long sum = (long) arr[left] + arr[right];
            long diff = Math.abs(sum - target);
            long pairDiff = (long) arr[right] - arr[left];

            // Update the best pair
            if (diff < minDiff ||
                (diff == minDiff && pairDiff > maxPairDiff)) {

                minDiff = diff;
                maxPairDiff = pairDiff;

                ans.clear();
                ans.add(arr[left]);
                ans.add(arr[right]);
            }

            // Move pointers
            if (sum < target) {
                left++;
            } 
            else if (sum > target) {
                right--;
            } 
            else {
                break;
            }
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1)