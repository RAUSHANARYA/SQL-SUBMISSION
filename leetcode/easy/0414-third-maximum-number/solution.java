class Solution {
    public int thirdMax(int[] nums) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        int max = nums[0];

        for(int i:nums)
        {
            max = Math.max(max,i);
            if(set.contains(i)) continue;
            set.add(i);
            pq.offer(i);
            if(pq.size()>3) pq.poll();
          
        }
        if(pq.size()<3) return max;
        return pq.peek();
    }
}