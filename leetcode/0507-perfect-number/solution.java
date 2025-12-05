class Solution {
    public boolean checkPerfectNumber(int num) {
       if(num<6)
        return false;
        int sum=1;
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                int fact1=num/i;
                int fact2=i;
                if(fact1==fact2)
                    sum= sum+fact1;
                else
                    sum= sum+fact1+fact2;
            }
        }
         if(sum==num)
            return true;
        
        return false;
    }
}
