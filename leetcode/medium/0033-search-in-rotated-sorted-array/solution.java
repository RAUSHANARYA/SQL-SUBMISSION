// class Solution {
//     public int search(int[] nums, int target) 
//     {
//        int i =0;
//        while(i<nums.length-1 && nums[i]<=nums[i+1]) 
//        {
//         i++;
//        }
       
//        int left = check(nums , 0 , i , target );
//        if(left!=-1) return left;
      
//        return check (nums , i+1 , nums.length-1 , target);
//     }

//     private int check (int arr[] , int s , int e , int target)
//     {
//         while(s<=e)
//         {
//             int mid = s+(e-s)/2;
//            if(arr[mid]== target)
//            {
//             return mid;
//            }
//         else if(arr[mid]<target)
//         {
//             s = mid+1;
//         }
//         else
//         {
//             e = mid-1;
//         }
//       }
//       return -1;
//     }
    
// }

class Solution {
    public int search(int[] nums, int target) 
    {
        int n = nums.length;
        int s =0; int e = n-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;

            if(nums[mid]==target) return mid;

            if(nums[mid]>=nums[s])    // if 7>4 left sorted check in left 
            {
              if(nums[mid]>target && target>=nums[s])  //7>0 && 0>4
              {
                 e = mid-1;
              } 
              else
              {
               s=mid+1;
              }
            }
            else                  // right half 
            {
               if(nums[mid]<target && target<=nums[e])
               {
                s=mid+1;
               }
               else
               {
                e = mid-1;
               }
            }
        }
        return -1;
    }
}