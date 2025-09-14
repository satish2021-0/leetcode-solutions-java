class Solution {
    public boolean isPowerOfThree(int n) {
               if(n<=0)
                 return false;
           while(n>1){
            int bit = n%3;
              if(bit!=0)
              return false;
             n/=3;
           }
           return true;
    }
}
