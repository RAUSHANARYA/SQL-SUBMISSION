# Sort by Decreasing Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers  **arr[]**, sort the array according to frequency of elements, i.e. elements that have higher frequency comes first. If the frequencies of two elements are the same, the smaller number comes first.

 **Examples :** 

```
Input: arr[] = [5, 5, 4, 6, 4]
Output: [4, 4, 5, 5, 6]
Explanation: The highest frequency here is 2. Both 5 and 4 have that frequency. Now since the frequencies are the same the smaller element comes first. So 4 4 comes first then comes 5 5. Finally comes 6. The output is 4 4 5 5 6.

```

```
Input: arr[] = [9, 9, 9, 2, 5]
Output: [9, 9, 9, 2, 5]
Explanation: The highest frequency here is 3. Element 9 has the highest frequency So 9 9 9 comes first. Now both 2 and 5 have the same frequency. So we print smaller elements first. The output is 9 9 9 2 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T19:07:15.191Z  

```java
class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int size = map.size();
        List<List<Integer>> list = new ArrayList<>();
        
          for (int value : map.keySet()) {
                   List<Integer> pair = new ArrayList<>();
                   pair.add(value);
                   pair.add(map.get(value));
                   list.add(pair);
               }
        list.sort((a, b) -> {
                  if (!a.get(1).equals(b.get(1))) {
                      return Integer.compare(b.get(1), a.get(1));
                  }
                  return Integer.compare(a.get(0), b.get(0));
              });
        
        
      
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            int v = list.get(i).get(0);
            int u = list.get(i).get(1);
            for(int j=0;j<u;j++)
            {
                result .add(v);
            }
        }
        return result ;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1)