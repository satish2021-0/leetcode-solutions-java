
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list= new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(divideNumber(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean divideNumber(int n){
        
        if(n<10)
            return true;
            int k=n;
        while(k>0){
            int z=k%10;
            if(z==0)
                return false;
                if(n%z!=0)
                    return false;
            k/=10;
        }
        return true;
    }
}
