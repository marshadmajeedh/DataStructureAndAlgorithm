public class ReturnMinimumSizeSubarraySum {
    public static int returnMinimumSubarraySum(int[] nums, int target) {
        int leftTracker = 0;

        int minimumLength = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                int length = i  - leftTracker + 1;
                if(length < minimumLength){
                    minimumLength = length;
                }
                sum -= nums[leftTracker++];
            }

        }

        if(minimumLength == Integer.MAX_VALUE){
            return 0;
        }
        return minimumLength;
    }
}
