class Solution {
    public int jump(int[] nums)
     {
        int n = nums.length;
       int end=0, maxJump=0, step = 0;
       for(int i=0;i<n-1;i++)
       {
          maxJump=Math.max(maxJump,i+nums[i]);
          if(end==i)
          {
            end =maxJump;
            step++;
          }
          
       }
       return step;
    }
}

