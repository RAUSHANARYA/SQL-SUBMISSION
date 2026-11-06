# Job Sequencing Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two arrays:  **deadline[]**, and **profit[]**, which represent a set of jobs, where each job is associated with a deadline, and a profit. Each job takes 1 unit of time to complete, and only one job can be scheduled at a time. You will earn the profit associated with a job only if it is completed by its deadline.

Your task is to return the following two values

- Number of jobs selected for the maximum profit. 
- The total maximum profit by completing those jobs.

 **Examples :** 

```
Input: deadline[] = [4, 1, 1, 1], profit[] = [20, 10, 40, 30]
Output: [2, 60]
Explanation: Job1 and Job3 can be done with maximum profit of 60 (20 + 40).

```

```
Input: deadline[] = [2, 1, 2, 1, 1], profit[] = [100, 19, 27, 25, 15]
Output: [2, 127]
Explanation: Job1 and Job3 can be done with maximum profit of 127 (100 + 27).
```

```
Input: deadline[] = [3, 1, 2, 2], profit[] = [50, 10, 20, 30]
Output: [3, 100]
Explanation: Job1, Job3 and Job4 can be completed with a maximum profit of 100 (50 + 20 + 30).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T16:43:38.046Z  

```java
import java.util.*;

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        int maxDeadline = 0;
        for (int d : deadline) {
            maxDeadline = Math.max(maxDeadline, d);
        }

        int[][] arr = new int[n][2];

        // First insert the data
        for (int i = 0; i < n; i++) {
            arr[i][0] = deadline[i];
            arr[i][1] = profit[i];
        }

        // Sort by descending profit
        Arrays.sort(arr, (a, b) ->
            Integer.compare(b[1], a[1]));

        // Store available slots
        TreeSet<Integer> slots = new TreeSet<>();

        int limit = Math.min(n, maxDeadline);

        for (int i = 1; i <= limit; i++) {
            slots.add(i);
        }

        int totalProfit = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            int d = Math.min(arr[i][0], limit);
            int p = arr[i][1];

            // Find latest available slot <= deadline
            Integer slot = slots.floor(d);

            if (slot != null) {

                totalProfit += p;
                count++;

                // Remove occupied slot
                slots.remove(slot);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(totalProfit);

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1)