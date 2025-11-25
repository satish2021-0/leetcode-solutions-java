class Solution {
    public void sortColors(int[] nums) {
        int countzero=0;
        int countone=0;
        for(int x:nums){
            if(x==0){
                countzero++;
            }
            else if(x==1){
                countone++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<countzero)
                nums[i]=0;
            
            else if(i<countzero + countone)
                nums[i]=1;

            else
                nums[i]=2;
        }
    }
}
