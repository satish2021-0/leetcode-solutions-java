class Solution {
    public boolean isPowerOfTwo(int n) {
           if (n==0 || n<0)
           return false;
          int bit ;
        while(n>1){
             bit = n;
            if(bit%2==1)
              return false;
              n=n/2;
        }
        return true;
    }
}
