// Last updated: 8/11/2026, 6:36:56 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // track lowest price so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // update profit
            }
        }
        
        return maxProfit;
    }
}
