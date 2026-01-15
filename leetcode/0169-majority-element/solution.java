// class Solution {
//     public int majorityElement(int[] nums) {
//         int maj=nums.length/2;
//         int max=nums[0];
//         int min=nums[0];
//         for(int x:nums){
//             if(x>max)
//                 max=x;
//             else if(x<max)
//                 min=x;
//         }
//         int [] freq = new int[max-min+1];
//         for(int i=0; i<nums.length;i++){
//             freq[nums[i]-min]++;
//         }

//         for(int i=0;i<freq.length;i++){
//             if(freq[i]>maj)
//                 return i+min;
//         }
//     return 0;
//     }
// }

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {

        int maj = nums.length / 2;
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m1.put(nums[i], m1.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
            if (entry.getValue() > maj)
                return entry.getKey();
        }
        return 0;
    }
}
