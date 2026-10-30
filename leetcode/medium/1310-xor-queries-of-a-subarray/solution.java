class Solution {
    public int[] xorQueries(int[] arr, int[][] queries)
     {
        int n = arr.length;
        int  prefix[] = new int[n+1];
        for(int i=0;i<n;i++)
        {
            prefix[i+1]=prefix[i]^arr[i];
        }
        int a[] = new int[queries.length];
        int k=0;
        for(int d[]:queries)
        {
           a[k++]=prefix[d[1]+1]^prefix[d[0]]; 
        }
        return a;
    }
}