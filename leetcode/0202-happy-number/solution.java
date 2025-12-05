class Solution {
    public boolean isHappy(int n) {
        int k = n; 
        while (true) {
            int sum = 0;
            while (k > 0) {
                int p = k % 10;   
                sum += p * p;    
                k = k / 10;       
            }
            if (sum == 1)
                return true;
            if (sum == 4)
                return false;

            k = sum;
        }
    }
}

