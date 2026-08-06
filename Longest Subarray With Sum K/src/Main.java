public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int maxLength = ReturnLongestSubarrayWithSumEqualsK.longestSubarray(nums, k);
        System.out.println(maxLength);
    }
}