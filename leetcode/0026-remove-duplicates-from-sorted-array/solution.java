class Solution {
    public int removeDuplicates(int[] nums) {
        // Two Pointer approach
        if(nums.length==0)
            return 0;

        int count =1;
        for(int i=0,j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                count++;
            }
        }
    return count;
    }
}
