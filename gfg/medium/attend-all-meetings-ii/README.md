# Meeting Rooms II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays  **start[]** and **end[]**  such that start[i] is the starting time of ith meeting and end[i] is the ending time of ith meeting. Return the  **minimum number**  of rooms required to attend all meetings.

 **Note:**  A person can also attend a meeting if it's starting time is same as the previous meeting's ending time.

 **Examples:** 

```
Input: start[] = [1, 10, 7], end[] = [4, 15, 10]
Output: 1
Explanation: Since all the meetings are held at different times, it is possible to attend all the meetings in a single room.
```

```
Input: start[] = [2, 9, 6], end[] = [4, 12, 10]
Output: 2
Explanation: 1st and 2nd meetings at one room but for 3rd meeting one another room required.

```

 **Constraints:** 
1 ≤ start.size() = end.size() ≤ 105
0 ≤ start[i] < end[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T14:30:14.673Z  

```java
// class Solution {
//     public int minMeetingRooms(int[] start, int[] end) {
//         // code here
//         PriorityQueue<Integer>pq = new PriorityQueue<>();
        
//         int n = start.length;
//         int arr[] = new int[n][2];
//         for(int i=0;i<n;i++)
//         {
//             arr[i][0]=start[i];
//             arr[i][1]=end[i];
//         }
//       Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//       pq.offer(arr[0][1]);
       
//       for(int i=1;i<n;i++)
//       {
//           if(arr[i][0]>=pq.peek())
//           {
//               pq.poll() ;
//           }
//           pq.offer(arr[i][1]);
          
//       }
//       return pq.size();
        
//     }
// }


class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        int n = start.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {

            if (!pq.isEmpty() && arr[i][0] >= pq.peek()) {
                pq.poll();
            }

            pq.offer(arr[i][1]);
        }

        return pq.size();
    }
}

// Time Complexity: O(n log n)
// Space Complexity: O(n)

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/attend-all-meetings-ii/1)