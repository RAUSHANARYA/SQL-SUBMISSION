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
