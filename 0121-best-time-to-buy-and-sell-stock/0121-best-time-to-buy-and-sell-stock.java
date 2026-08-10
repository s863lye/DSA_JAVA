class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int minimumPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;
        int profit = 0;

        for (int i = 0; i < n; i++){
            
            if (prices[i] < minimumPrice){
                minimumPrice = prices[i];
            }
            profit = prices[i] -  minimumPrice;

            maximumProfit = Math.max(profit, maximumProfit);
        }
        return maximumProfit;
    }
}