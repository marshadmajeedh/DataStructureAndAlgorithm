public class Main {
    public static void main(String[] args) {

        int[] nums = {0,1,1,1,0,1,1,0,1};
        int length = LongestSubArray.longestSubArray(nums);
        System.out.println("Longest subarrays after replacing exactly one element : "+length);
    }
}