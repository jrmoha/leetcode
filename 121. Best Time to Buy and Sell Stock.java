class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
        int n = prices.length;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] > min) {
if(prices[i]-min>maxProfit)maxProfit=prices[i]-min;
            } else {
                min=prices[i];
            }
        }
        return maxProfit;
    }
}