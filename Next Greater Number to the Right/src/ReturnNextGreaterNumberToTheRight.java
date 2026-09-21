import java.util.Arrays;
import java.util.Stack;

public class ReturnNextGreaterNumberToTheRight {

    public static int[] returnNextGreaterNumberToTheRight(int[] nums){

        int[] answers = new int[nums.length];
        Arrays.fill(answers, -1);
        Stack<Integer> stack = new Stack<>();

        //2, 1, 2, 4, 3
        for(int i = 0; i < nums.length; i++){

            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                answers[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return answers;
    }
}
