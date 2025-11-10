class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tempCount=0;
        int finalCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                tempCount++;
                else{
                    if(tempCount>finalCount){
                        finalCount=tempCount;
                    }
                    tempCount=0;
                }
                if(tempCount>finalCount)
                    finalCount=tempCount;
        }
        return finalCount;
    }
}
