import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ReturnNextWarmTemperature {
    public static int[] nextTemperatureDays(int[] temperatures) {

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int length = temperatures.length;
        int[]response = new int[length];


        //73,74,75,71,69,72,76,73
        //70, 71, 70, 72
        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int daysNeeded = i -  stack.peek();
                map.put(stack.pop(),daysNeeded);
            }
            stack.push(i);
        }

        for (int i = 0; i < length; i++) {
            response[i] = map.getOrDefault(i, 0);
        }
        return response;
    }
}
