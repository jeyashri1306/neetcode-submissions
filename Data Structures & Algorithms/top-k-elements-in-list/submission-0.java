class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> count  = new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num,0)+ 1);
        }
        // [[1:3],[2:1]], as integer key,values
        List<int[]> arr = new ArrayList<>();
//get the key and values and sort them like[3:1]  values,key
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            arr.add(new int[] {entry.getValue(),entry.getKey()});
        }
        //b[0] - a[0] to get in descending order 3:1 2:2 to get in ascending order then 
        // a[0]-b[0];
        arr.sort((a,b) -> b[0]- a[0]);

        int[] res = new int[k];
        for(int i=0;i<k;i++){
      
            res[i] = arr.get(i)[1];
      //here get(i)[1] is to get the value which has highest frequency like
      // 3:1 is high so taking the key instd of value 
        }
        return res;
    }
}
