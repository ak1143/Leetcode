class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int prof = 0;

        int n = prices.length;

        for(int i=0;i<n;i++){
            prof = Math.max(prof,prices[i]-min);
            min = Math.min(prices[i],min);
        }

        return prof;
    }
}