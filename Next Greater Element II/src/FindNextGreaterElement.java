import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class FindNextGreaterElement {
    public static List<Integer> findNextGreaterElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        //1,2,1 //1,2,1

        //1,2,3,4,3 //1,2,3,4,3

        //8,6,5,3,2,7 //6,5,3,2,1

        for (int i = 0; i < nums.length; i++) {
            //5, 4, 3, 2, 1
            while(!stack.isEmpty() && nums[i] >  stack.peek()) {
                map.put(stack.pop(),nums[i]);
            }

            stack.push(nums[i]);

            if (i == nums.length - 1) {
                int leftIndex = 0;

                while (!stack.isEmpty() && leftIndex < nums.length) {
                    if (stack.peek() >= nums[leftIndex]) {
                        leftIndex = leftIndex + 1;
                        continue;
                    }
                    map.put(stack.pop(), nums[leftIndex]);
                }
            }
        }

        List<Integer> response = new ArrayList<>();
        for (int num : nums) {
            response.add(map.getOrDefault(num, -1));
        }
        return response;
    }
}
