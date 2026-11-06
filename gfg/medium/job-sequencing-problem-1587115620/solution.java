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