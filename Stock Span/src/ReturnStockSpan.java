import java.util.HashMap;
import java.util.Stack;

public class ReturnStockSpan {
    public static int[] stockSpans (int[]stocks){

        int length  = stocks.length;
        int[] responses =  new int[length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        //100, 80, 60, 70, 60, 75, 85
        for (int i = 0; i < stocks.length; i++) {

            while (!stack.isEmpty() && stocks[i] >= stocks[stack.peek()]) {
                if (map.containsKey(stack.peek())) {
                    map.put(i,map.get(stack.pop()));
                } else {
                    map.put(i, stack.pop());
                }
            }
            stack.push(i);
        }

        for (int i = 0; i < stocks.length; i++) {

            if (map.containsKey(i)) {
                int stocksSpan = i - map.get(i) + 1;
                responses[i] = stocksSpan;
            } else {
                responses[i] = 1;
            }
        }

        return responses;
    }
}
