import java.util.Arrays;

public class ReturnProductOfArrayExceptSelf {
    public static int[] returnProductExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //int[] nums = {1,2,3,4};
        //24,12,8,6
        //1,1,2,6

        int leftProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0){
                leftProduct *= nums[i-1];
            }
            result[i] = leftProduct;
        }

        int rightProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (i < nums.length-1) {
                rightProduct *= nums[i+1];
            }

            result[i] *= rightProduct;
        }

        return result;
    }
}
