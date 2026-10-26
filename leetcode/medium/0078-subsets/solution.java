class Solution {
    public List<List<Integer>> subsets(int[] nums)
     {
        List<Integer>path = new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        backtrack(0,nums,path,ans);

        return ans;
    }
    void  backtrack(int i ,int[]nums,List<Integer>path, List<List<Integer>> ans)
    {
         ans.add(new ArrayList<>(path)); // []

         for(int j =i;j<nums.length;j++)
         {
            path.add(nums[j]); 

            backtrack(j+1,nums,path,ans);

            path.remove(path.size()-1);

         }
    }

}