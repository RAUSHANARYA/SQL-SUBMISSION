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