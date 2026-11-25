class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> imap = new HashMap<>();
        PriorityQueue<Integer> pq = new   PriorityQueue<>((a,b)->imap.get(a)-imap.get(b));
         
        for(int i : nums)
        {
            imap.put(i,imap.getOrDefault(i,0)+1);
        }
        for(int i: imap.keySet())
        {
            pq.offer(i);
             if(pq.size() > k) {
                pq.poll();
            }
        }
  int[] ans = new int[k];
  int i =0;

        // for(int i = 0; i < k; i++) {
        //     ans[i] = pq.poll();
        // }
        while (!pq.isEmpty())
        {
            ans[i++]=pq.poll();
        }
  
        return ans;

    }
}