public class Algorithm {
    public static int returnMaximumProfit(int[] prices) {

        int maxProfit = 0;
        int leftIndex = 0;

        //7,1,5,3,6,4
        //7,6,4,3,1
        for (int i = 1; i < prices.length; i++) {

            while(leftIndex < prices.length && prices[leftIndex] > prices[i]) {
                leftIndex++;
            }

            int profit = prices[i] -  prices[leftIndex];
            maxProfit = Math.max(maxProfit, profit);
        }
        return  maxProfit;
    }
}
