class Solution {
    public List<List<Integer>> combinationSum3(int k, int n)
     {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(k>n) return ans;
        backtrack(1,k,n,path,ans);

        return ans;

    }
    void backtrack(int i , int k ,int target ,List<Integer> path ,
    
                                   List<List<Integer>> ans )
    {
        if(target==0 && path.size()==k)
        {
            ans.add(new ArrayList<>(path));
            return;
        }
       if(target<0 || path.size()>=k)
       {
        return;
       }
       for(int j=i;j<=9;j++)
       {
         path.add(j);
         backtrack(j+1,k,target-j,path,ans);
         path.remove(path.size()-1);
       }

     }
}