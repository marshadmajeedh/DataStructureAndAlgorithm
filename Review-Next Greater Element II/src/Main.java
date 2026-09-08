import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {3, 8, 4, 1, 2};
        int[] result = ReturnNextGreaterElement.nextGreaterElements(nums);
        System.out.println(Arrays.toString(result));
    }
}