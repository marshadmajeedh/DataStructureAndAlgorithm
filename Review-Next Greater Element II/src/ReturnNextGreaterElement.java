import java.util.HashMap;
import java.util.Stack;

public class ReturnNextGreaterElement {
    public static int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                map.put(stack.pop(), nums[i]);
            }
            stack.push(i);
            //5, 4, 3, 2, 1
            if (i == nums.length - 1){
                int k = 0;
                while (!stack.isEmpty() && k <= nums.length - 1){

                    if (nums[k] > nums[stack.peek()]) {
                        map.put(stack.pop(), nums[k]);
                    } else {
                        k++;
                    }
                }
            }
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            result[i] = map.getOrDefault(i, -1);
        }
        return result;
    }
}
