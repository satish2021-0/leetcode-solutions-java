import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
       List<Integer> s1 = new ArrayList<>();
       for(int x:nums){
         if (x != val)
            s1.add(x);
       } 

       

        for(int i=0; i<s1.size();i++){
           nums[i] = s1.get(i);
        }

    return s1.size();
    }
}
