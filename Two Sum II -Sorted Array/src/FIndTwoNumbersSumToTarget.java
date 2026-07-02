public class FIndTwoNumbersSumToTarget {

    public static int[] findTwoNumbersSum(int[] nums, int target) {

        int maxIndex = nums.length-1;
        int minIndex = 0;

        while (maxIndex > minIndex) {
            int sum =  nums[maxIndex] + nums[minIndex];
            if(sum > target){
                maxIndex--;
            } else if (sum < target){
                minIndex++;
            } else {
                break;
            }
        }

        return new int[] {minIndex,maxIndex};
    }
}
