public class FindMaximumProfit {

    public static int findMaximumProfit(int[] prices) {

        int minimum = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            int newProfit = prices[i] - minimum;

            if (newProfit > profit) {
                profit = newProfit;
            }

            minimum = Math.min(minimum, prices[i]);
        }

        return profit;
    }
}
