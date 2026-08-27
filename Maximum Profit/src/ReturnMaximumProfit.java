import java.util.Stack;

public class ReturnMaximumProfit {
    public static int maxProfit(int[] prices) {

        //int[] prices = {7, 1, 5, 3, 6, 8};
        Stack<Integer> stack = new Stack<>();

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if(!stack.isEmpty() && prices[i] > prices[stack.peek()]){
                maxProfit = Math.max(maxProfit, prices[i] - prices[stack.peek()]);
            }else {
                stack.push(i);
            }
        }

        return maxProfit;
    }
}
