class Solution {
    public List<List<Integer>> subsets(int[] nums)
     {
        List<Integer>path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums,0,path,ans);
        return ans;
    }

    void backtrack(int[]arr,int i, List<Integer>path,  List<List<Integer>> ans)
    {
        //base case
        if(i==arr.length)
        {
            ans.add(new ArrayList<>(path));
            return;
        }

    

    // Take
    path.add(arr[i]);
    backtrack(arr, i + 1, path, ans);

    // Backtrack
    path.remove(path.size() - 1);
    // Not Take
    backtrack(arr, i + 1, path, ans);
    }

}