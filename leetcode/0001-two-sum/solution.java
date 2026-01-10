import java.util.NoSuchElementException;
class Solution {
    public int[] twoSum(int[] nums, int target) {

       Map<Integer, Integer> m1 = new HashMap<>();

       for(int i=0; i<nums.length;i++){

        int temp = target-nums[i];

        int index= m1.getOrDefault(temp,-1);

        if(index>=0)
            return new int []{i,index};

        m1.put(nums[i],i);

       }
       throw new NoSuchElementException("Element is not present");
    }
}
