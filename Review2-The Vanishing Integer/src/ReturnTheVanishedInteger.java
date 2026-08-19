public class ReturnTheVanishedInteger {
    public static int returnTheVanishedInteger(int[] nums){


        int sum1 = 0;

        for (int i = 0; i <= nums.length; i++){
            sum1 += i;
        }
        int sum2 = 0;

        for (int num : nums) {
            sum2 += num;
        }

        return sum1 - sum2;
    }
}
