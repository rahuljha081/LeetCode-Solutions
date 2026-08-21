class Solution {
    public int maxProfit(int[] prices) {
        int till_min=prices[0];
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-till_min;
            max_profit=Math.max(profit,max_profit);
            till_min=Math.min(till_min,prices[i]);
        }
        return max_profit;
    }
}