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