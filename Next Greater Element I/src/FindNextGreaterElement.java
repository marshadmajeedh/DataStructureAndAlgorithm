import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class FindNextGreaterElement {
    public static List<Integer> findNextGreaterElements(int[] nums1,int[] nums2) {
        HashMap<Integer,Integer> numsTwoAnswers = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // int[] nums1 = {4};
        // int[] nums2 = {1, 5, 4, 3, 6};

        for (int i  = 0; i < nums2.length; i++) {

            while (!stack.isEmpty() && nums2[i] >  stack.peek()) {
                numsTwoAnswers.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        List<Integer> responses = new ArrayList<>();
        for (int j : nums1) {
            if (numsTwoAnswers.get(j) == null){
                responses.add(-1);
            }else {
                responses.add(numsTwoAnswers.get(j));
            }
        }
        return responses ;
    }
}
