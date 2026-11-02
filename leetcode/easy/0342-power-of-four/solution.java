class Solution {
    public boolean isPowerOfFour(int n) 
    {
        // if(n==2||n==8 ||n==12) return false;
        return n>0 && (n & (n-1))==0 && n%3==1;
    }
}