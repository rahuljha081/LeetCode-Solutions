class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_till=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-min_till;
            max_profit=Math.max(max_profit,profit);
            if(prices[i]<min_till){
                min_till=prices[i];
            }
        }
        return max_profit;
    }
}