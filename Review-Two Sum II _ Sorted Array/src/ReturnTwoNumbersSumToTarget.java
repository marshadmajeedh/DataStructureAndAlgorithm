public class ReturnTwoNumbersSumToTarget {
    public static int[] returnTwoSumUpToTarget(int[] nums, int target) {
        int[] result = new int[2];

        int rightIndex = nums.length - 1;
        int leftIndex = 0;
        while (leftIndex < rightIndex) {
            int sum = nums[leftIndex] + nums[rightIndex];

            if (sum > target){
                rightIndex--;
            } else if (sum < target) {
                leftIndex++;
            } else {
                break;
            }
        }
        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;
    }
}
