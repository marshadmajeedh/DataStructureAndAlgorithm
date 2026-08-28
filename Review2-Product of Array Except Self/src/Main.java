import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] result = ReturnProductOfArrayExceptSelf.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}