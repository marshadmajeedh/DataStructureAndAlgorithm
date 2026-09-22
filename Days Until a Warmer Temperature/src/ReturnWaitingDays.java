import java.util.Arrays;
import java.util.Stack;

public class ReturnWaitingDays {
    public static int[] daysUntilAWarmerTemperature(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] waitingDays = new int[temperatures.length];
        Arrays.fill(waitingDays, 0);

        for(int i = 0; i < temperatures.length; i++){

            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                waitingDays[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return waitingDays;
    }
}
