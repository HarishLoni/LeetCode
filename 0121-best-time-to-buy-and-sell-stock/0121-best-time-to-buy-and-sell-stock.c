int maxProfit(int* prices, int pricesSize) {
    int profit=0;
    int buyprice=prices[0];
    for(int i=1;i<pricesSize;i++){
        if(prices[i]<buyprice){
            buyprice=prices[i];
        }
        else{
            int currentprofit=prices[i]-buyprice;
            profit=(currentprofit>profit)?currentprofit:profit;
        }
    }
    return profit;
    
}