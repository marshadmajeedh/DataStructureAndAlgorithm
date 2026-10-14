public class Main {
    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        int target = 15;
        int minimumLength = ReturnMinimumSizeSubarraySum.returnMinimumSubarraySum(nums, target);
        System.out.println(minimumLength);
    }
}