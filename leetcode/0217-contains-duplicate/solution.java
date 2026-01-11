class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> m1 = new HashSet<>();

        for(int i=0;i<nums.length;i++){

            if(m1.contains(nums[i]))
                return true;

            m1.add(nums[i]);
        }
        return false;
    }
}
