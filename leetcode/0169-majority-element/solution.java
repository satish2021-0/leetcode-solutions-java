import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {

        int maj=nums.length/2;
       Map<Integer, Integer> m1= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m1.put(nums[i], m1.getOrDefault(nums[i],0) +1);
        }

        for(Map.Entry<Integer, Integer> entry : m1.entrySet()) {
            if(entry.getValue()>maj)
                return entry.getKey();
        }
      return 0;
    }
}
