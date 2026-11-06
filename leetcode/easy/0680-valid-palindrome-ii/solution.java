class Solution {
    public boolean validPalindrome(String s)
     {
        int l =0;
        int r = s.length()-1;
       while(l<r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return palindrome(l+1, r, s) || palindrome(l, r-1, s);
            }
        }
            return true;

    }
private boolean palindrome( int start , int end,String s )
  {
    while(start<end)
    {
         char ch = s.charAt(start);
         char c = s.charAt(end);

         if(ch!=c)
            {
                return false;
            }
            
            start++;
            end--;

    }
    return true;
}
}