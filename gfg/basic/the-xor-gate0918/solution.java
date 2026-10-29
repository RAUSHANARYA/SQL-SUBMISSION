class Solution {
    int findXOR(List<Integer> arr) {
        // code here
        int xor =0;
        for(int x : arr)
        {
            xor^=x;
        }
        return xor;
    }
}