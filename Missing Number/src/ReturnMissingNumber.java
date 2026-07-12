public class ReturnMissingNumber {
    public static int missingNumber(int[] nums) {
        int sum1 = 0;
        for (int num : nums) {
            sum1 += num;
        }
        int sum2 = 0;
        int length = nums.length;
        for (int i = 0; i <= length; i++) {
            sum2 += i;
        }
        return sum2 - sum1;
    }
}
