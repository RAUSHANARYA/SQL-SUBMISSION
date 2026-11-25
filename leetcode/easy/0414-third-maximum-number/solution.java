class Solution {
    public int thirdMax(int[] nums) 
    {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // HashSet<Integer> set = new HashSet<>();
        // int max = nums[0];

        // for(int i:nums)
        // {
        //     max = Math.max(max,i);
        //     if(set.contains(i)) continue;
        //     set.add(i);
        //     pq.offer(i);
        //     if(pq.size()>3) pq.poll();
          
        // }
        // if(pq.size()<3) return max;
        // return pq.peek();

         long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            // Ignore duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            // Case 1: Current number is maximum
            if (num > first) {
                third = second;
                second = first;
                first = num;
            }

            // Case 2: Current number is second maximum
            else if (num > second) {
                third = second;
                second = num;
            }

            // Case 3: Current number is third maximum
            else if (num > third) {
                third = num;
            }
        }

        // If third maximum does not exist
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }

        return (int) third;
        
    }
}