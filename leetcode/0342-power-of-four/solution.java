class Solution {
    public boolean isPowerOfFour(int n) {
         if(n<=0)
                 return false;
           while(n>1){
            int bit = n%4;
            if(bit!=0)
              return false;
              n/=4;
    }
    return true;
}
}
