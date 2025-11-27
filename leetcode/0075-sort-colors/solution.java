class Solution {
    public void sortColors(int[] nums) {
        int countzero=0;
        int count1=0;
        for(int x:nums){
            if(x==0)
                countzero++;
            else if(x==1)
                count1++;
        }
        for(int i=0; i<nums.length;i++){
            if(i<countzero)
                nums[i]=0;
            else if(i<countzero + count1)
                 nums[i]=1;
            else
                nums[i]=2;
        }
    }
}
