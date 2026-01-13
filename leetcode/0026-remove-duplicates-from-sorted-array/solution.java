class Solution {
    public int removeDuplicates(int[] nums) {
        // Two Pointer approach
        if(nums.length==0)
            return 0;

        int count =1; // Ist element toh unique he rehta hai.... agr mai yha count = 0 le leta toh 1st  index wla unique count he nhi hota...
        for(int x=0,j=1;j<nums.length;j++){
            if(nums[x]!=nums[j]){
                x++;
                nums[x]=nums[j];
                count++;
            }
        }
    return count;
    }
}

