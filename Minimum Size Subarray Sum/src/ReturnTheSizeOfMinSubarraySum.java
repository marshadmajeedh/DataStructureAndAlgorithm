public class ReturnTheSizeOfMinSubarraySum {
    public static int minSubArrayLen(int[] nums,int target) {

        int minimumLength = nums.length+1;
        int sum = 0;
        int leftIndex = 0;

//        int target = 100;
//        int[] nums = {1,2,3};

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {

                int minLength = i - leftIndex + 1;

                if (minLength < minimumLength) {
                    minimumLength = minLength;
                }

                sum -= nums[leftIndex++];

            }

            System.out.println(sum);
        }
        // this means there is no valid sub arrays
        if (minimumLength == nums.length+1) {
            return 0;
        }

        return minimumLength;
    }
}
