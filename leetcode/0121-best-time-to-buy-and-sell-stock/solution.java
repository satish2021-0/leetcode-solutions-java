class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int profit=0;
         int minProfit=0;
        for(int i=0; i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            minProfit=prices[i]-minPrice;
           profit= profit>minProfit?profit:minProfit;
        }
        return profit;
    }

}
