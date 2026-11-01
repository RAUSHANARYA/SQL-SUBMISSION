

class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(r < n)
        {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // If frequency exceeds k, shrink the window
            while(map.get(nums[r]) > k)
            {
                map.put(nums[l], map.get(nums[l]) - 1);

                if(map.get(nums[l]) == 0)
                    map.remove(nums[l]);

                l++;
            }

            // Calculate maximum valid window length
            maxLen = Math.max(maxLen, r-l+1);

            r++;
        }

        return maxLen;
    }
}