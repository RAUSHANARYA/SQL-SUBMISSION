class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, path, used, ans);

        return ans;
    }

    void backtrack(int[] nums, List<Integer> path,
                   boolean[] used, List<List<Integer>> ans) {

        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Skip already used elements
            if (used[i]) {
                continue;
            }

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // Choose
            path.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, path, used, ans);

            // Undo
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}