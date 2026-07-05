import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {2,3};
        int[] result = ReturnProductOfArrayExceptSelf.returnProductExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}