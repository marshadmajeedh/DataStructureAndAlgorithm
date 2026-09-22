import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int[] returnStockSpan(int[] prices) {
        int[] stockSpan = new int[prices.length];
        Arrays.fill(stockSpan, 1);

        Stack<Integer> stack = new Stack<>();
        //100, 80, 60, 70, 60, 75, 85
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {

                if(stockSpan[stack.peek()] != 1){
                    stockSpan[i] = stockSpan[i] + stockSpan[stack.pop()];
                    continue;
                }
                stockSpan[i] = i - stack.pop() + 1;
            }
            stack.push(i);
        }
        return stockSpan;
    }
}
