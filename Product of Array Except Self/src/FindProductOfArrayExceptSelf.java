public class FindProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] answers = new int [nums.length];

        int leftProduct = 1;
        int rightProduct = 1;

        int leftIndex;
        int rightIndex;

        for (leftIndex = 0; leftIndex < nums.length; leftIndex++) {

            if (leftIndex > 0){
                leftProduct *= nums[leftIndex-1];
            }
            answers[leftIndex] = leftProduct;
        }

        for (rightIndex = nums.length - 1; rightIndex >= 0; rightIndex--) {
            answers[rightIndex] *= rightProduct;

            rightProduct *= nums[rightIndex];
        }
        return answers;
    }

}

