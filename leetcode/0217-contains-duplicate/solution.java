import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> m1 = new HashMap<>();
      
        for(int i=0;i<nums.length;i++){
            if(m1.containsKey(nums[i]))
                return true;
            else{
                m1.put(nums[i],m1.getOrDefault(nums[i],0) +1);
            }
        }
        return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
        
//         Set<Integer> m1 = new HashSet<>();

//         for(int i=0;i<nums.length;i++){

//             if(m1.contains(nums[i]))
//                 return true;

//             m1.add(nums[i]);
//         }
//         return false;
//     }
// }
