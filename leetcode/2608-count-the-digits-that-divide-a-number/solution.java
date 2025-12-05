class Solution {
    public int countDigits(int num) {
        if(num<10)
            return 1;
        int k=num;
        int count=0;
        while(k>0){
            int z=k%10;
            if(num%z==0)
                count++;
            k/=10;
        }
        return count;
    }
}
