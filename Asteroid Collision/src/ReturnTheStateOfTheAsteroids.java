import java.util.Stack;

public class ReturnTheStateOfTheAsteroids {
    public static Stack<Integer> states (int[] asteroids) {


        Stack<Integer> stack = new Stack<>();
        //10, 2, -5, -10
        for (int asteroid : asteroids) {

            int poppedElement = 0;

            while (!stack.isEmpty() && stack.peek() <= Math.abs(asteroid) && asteroid < 0 && stack.peek() >= 0) {
                poppedElement = stack.pop();
                if (poppedElement == Math.abs(asteroid)) {
                    break;
                }
            }

            boolean flag = !stack.isEmpty() && stack.peek() > Math.abs(asteroid) && asteroid < 0 && stack.peek() >= 0;

            if (Math.abs(asteroid) != poppedElement && !flag) {
                stack.push(asteroid);
            }

        }


        return stack;
    }
}
