import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //method 1
    // for(int i = 0; i< nums.length;i++){
    //     for(int j = i + 1 ;j < nums.length;j++){
    //         if(nums[i] + nums[j]== target){

    //     return new int[] {i,j};
    //         }
            
    //     }
    // }   
    // its use to return empty array 
    // return new int[]{};
    // method 2
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i< nums.length;i++){
        int ans = target -nums[i];
        if(map.containsKey(ans)){
            return new int[]{map.get(ans),i};
        }
        map.put(nums[i], i);
        
    }
return new int[]{};
    }
    }

