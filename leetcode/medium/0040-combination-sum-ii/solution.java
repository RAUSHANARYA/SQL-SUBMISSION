class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(0, candidates, target, path, ans);

        return ans;
    }
      void backtrack(int i, int[] arr, int target,
                   List<Integer> path, List<List<Integer>> ans) {

        if(target==0)
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        if(i==arr.length) return;

        //take
        if(arr[i]<=target)
        {
            path.add(arr[i]);
            backtrack(i+1,arr,target-arr[i],path,ans);

            path.remove(path.size()-1);
        }
        int next=i+1;
        while(next<arr.length&&arr[next]==arr[i])
        {
            next++;
        }
        backtrack(next,arr,target,path,ans);


  }
}