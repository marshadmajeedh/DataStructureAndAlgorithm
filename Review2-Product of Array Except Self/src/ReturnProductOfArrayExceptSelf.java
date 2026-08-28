import java.util.Arrays;

public class ReturnProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        int[] rightProduct = new int[nums.length];
        int[] leftProduct = new int[nums.length];

        leftProduct[0] = 1;

        rightProduct[nums.length-1] = 1;

        int productLeft = 1;
        int productRight = 1;

        //1, 2, 3, 4

        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = productLeft *  nums[i - 1];
            productLeft *= nums[i - 1];
        }

        for (int i = nums.length-2; i >= 0; i--) {
            rightProduct[i]= productRight*nums[i+1];
            productRight *= nums[i + 1];
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }
        System.out.println(Arrays.toString(leftProduct));
        System.out.println(Arrays.toString(rightProduct));
        return result;
    }
}
