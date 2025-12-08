class Solution {
    public int differenceOfSum(int[] nums) {
       int sum=0;
       int digit=0;
        for(int x:nums){
            sum=sum+x;
            int num=x;
            if(num>9){
            while(num>0){
               digit=digit+num%10;
               num/=10;
            }
        }
        else
            digit=digit+x;
        }
        return (sum>digit)?(sum-digit):(digit-sum);
    }
}
