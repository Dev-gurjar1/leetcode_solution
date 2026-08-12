class Solution {
    public int maxProfit(int[] prices) {
      int MinPrice = prices[0];
      int MaxProfit = 0;
      for(int i = 1; i< prices.length;i++){
        if(prices[i]< MinPrice){
            MinPrice = prices[i];
        }
    int profit = prices[i]- MinPrice;
    if(profit > MaxProfit){
        MaxProfit = profit;
    }
      }
      return MaxProfit;

    }
}