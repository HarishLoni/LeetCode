class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int profit=0;
        
        for(int i=1;i<prices.length;i++){
            if(buyprice > prices[i]){
                buyprice=prices[i];
            }
            else{
                int curprofit=prices[i]-buyprice;
                profit=(curprofit > profit)?curprofit:profit;
            }
        }
        return profit;
    }
}