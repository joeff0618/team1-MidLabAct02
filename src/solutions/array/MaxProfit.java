package solutions.array;

import solutions.Solution;

/**
 * The {@code MaxProfit} class calculates the maximum profit achievable from buying
 * and selling a stock once, given its daily prices.
 * <p>
 * Link: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description">
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description</a>
 */
public class MaxProfit implements Solution {

    public static int maxProfit(int[] prices) {
        int lowest = prices[0];
        int profit = 0;
        for(int i = 0 ; i < prices.length; i++){
            int curr = prices[i];
            if (curr < lowest) {
                lowest = curr;
            }
            else if (curr - lowest > profit) {
                profit = curr - lowest;
            }

        }
        return profit;
    }


    @Override
    public void run() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Prices: [7, 1, 5, 3, 6, 4]");
        System.out.println("Max Profit: " + maxProfit(prices));
    }
}
