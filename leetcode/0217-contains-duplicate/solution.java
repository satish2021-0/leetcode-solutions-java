class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer, Integer> m1 = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(m1.containsKey(nums[i]))
                return true;

            m1.put(nums[i],i);
        }
        return false;
    }
}
