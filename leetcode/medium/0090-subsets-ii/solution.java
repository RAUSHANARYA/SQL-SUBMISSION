class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums)
     {
        Arrays.sort(nums);
         List<Integer>path = new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

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
    
    int next =i+1;
    while(next<arr.length && arr[next]==arr[i])
    {
        next++;
    }
    backtrack(arr, next, path, ans);
    }

}