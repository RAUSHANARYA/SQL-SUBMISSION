class Solution {
    public List<String> letterCasePermutation(String s) {

        List<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();

        backtrack(0, arr, ans);

        return ans;
    }

    void backtrack(int i, char[] arr, List<String> ans) {

        if (i == arr.length) {
            ans.add(new String(arr));
            return;
        }

        // Digit: only one choice
        if (Character.isDigit(arr[i])) {
            backtrack(i + 1, arr, ans);
            return;
        }

        // Take: lowercase
        arr[i] = Character.toLowerCase(arr[i]);
        backtrack(i + 1, arr, ans);

        // Take: uppercase
        arr[i] = Character.toUpperCase(arr[i]);
        backtrack(i + 1, arr, ans);

        // Restore original character
        // Not necessary for correctness here because both cases
        // have been explored, but useful for clean backtracking.
    }
}