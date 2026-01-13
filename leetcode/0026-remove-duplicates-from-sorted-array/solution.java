class Solution {
    public int removeDuplicates(int[] nums) {
        // Two Pointer approach
        if(nums.length==0)
            return 0;

        int count =1; // Ist element toh unique he rehta hai.... agr mai yha count = 0 le leta toh 1st  index wla unique count he nhi hota...
       for(int i=1,j=0;i<nums.length;i++){
        if(nums[i]!=nums[j]){
            j++;
            nums[j]=nums[i];
            count++;
        }
       }
    return count;
    }
}

