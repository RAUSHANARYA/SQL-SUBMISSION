class Solution {
    public boolean isPowerOfFour(int n) 
    {
        if(n==2) return false;
        return n>0 && (n & (n-1))==0;
    }
}