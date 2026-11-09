
class Solution {
    public int minCost(int[] arr)
    {
        int n = arr.length;
        int sum = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < n; i++)
        {
            q.offer(arr[i]);
        }

        while(q.size() >= 2)
        {
            int a = q.poll();
            int b = q.poll();

            int cost = a + b;

            sum += cost;

            q.offer(cost);
        }

        return sum;
    }
}