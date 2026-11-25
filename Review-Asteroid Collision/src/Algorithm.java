import java.util.Stack;

public class Algorithm {

    public static int[] asteroidCollision(int[] asteroids) {
        //[3,5,-6,2,-1]
        //[-6,2]

        //[8,-8,2]
        //[8]
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            boolean found = false;

            while (!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0 && Math.abs(asteroids[i]) >= stack.peek()) {
               int latestPopped = stack.pop();

               if(latestPopped == Math.abs(asteroids[i])){
                   found = true;
                   break;
               }
            }

            if(found){
                continue;
            }
            if(!stack.isEmpty() && asteroids[i] < 0 &&  Math.abs(asteroids[i]) <= stack.peek()){
                continue;
            }

            stack.push(asteroids[i]);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}