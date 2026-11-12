class Solution {
List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s)
    {
        backtrack(0,s,new ArrayList<>());
        return ans;
    }
    private void backtrack(int i, String s , List<String>curr)
    {
        if(i==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int j =i;j<s.length();j++)
        {
            String str = s.substring(i,j+1);
            
           if(palindrome(str))
           {
            curr.add(str);
            backtrack(j+1,s,curr);
            curr.remove(curr.size()-1);
           }
        
        }
    }
    private boolean palindrome(String str)
    {
        int left =0;
        int right = str.length()-1;
        while(left<right)
        {
           if( str.charAt(left)!=str.charAt(right)) return false;
            left++;
        right--;
        }
       return true;
    }
}