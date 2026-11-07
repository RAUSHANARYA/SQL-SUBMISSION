class Solution {
    public int countArrangement(int n) {

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        boolean[] used = new boolean[n];

        return backtrack(nums, used, 1);
    }

    int backtrack(int[] nums, boolean[] used, int pos) {

        // All positions filled
        if (pos > nums.length) {
            return 1;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!used[i]) {

                int num = nums[i];

                if (num % pos == 0 || pos % num == 0) {

                    // Choose
                    used[i] = true;

                    // Explore
                    count += backtrack(nums, used, pos + 1);

                    // Undo
                    used[i] = false;
                }
            }
        }

        return count;
    }
}