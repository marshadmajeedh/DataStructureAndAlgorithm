import java.util.HashMap;
import java.util.Stack;

public class ReturnDaysToWait {
    public static int[] daysNeedToWait(int[] temperatures){
        //temperatures = {73, 74, 75, 71, 69, 72, 76, 73}

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < temperatures.length; i++){

            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                map.put(stack.peek(), i - stack.pop());
            }
            stack.push(i);
        }

        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++){
            result[i] = map.getOrDefault(i, 0);
        }
        return result;
    }
}
