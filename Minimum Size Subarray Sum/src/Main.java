public class Main {
    public static void main(String[] args) {
        int target = 100;
        int[] nums = {1,2,3};
        int size = ReturnTheSizeOfMinSubarraySum.minSubArrayLen(nums, target);
        System.out.println("Minimum size of the subarray for target '"+target+"' is "+size);
    }
}