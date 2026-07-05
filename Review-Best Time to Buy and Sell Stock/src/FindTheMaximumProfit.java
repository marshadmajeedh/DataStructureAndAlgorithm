public class FindTheMaximumProfit {

    public static double findTheMaximumProfit(double[] prices) {
        double minPrice = prices[0];
        double maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }



        return  maxProfit;
    }
}
