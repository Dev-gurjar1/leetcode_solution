import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      //Prefix sum 0 has occured once
      map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int num : nums){
            sum += num;
            int required = sum - k;
            if(map.containsKey(required)){
                count +=  map.get(required);

            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}