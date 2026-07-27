public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int longestSubarray = ReturnLongestSubarray.longestSubarray(nums, k);
        System.out.println(longestSubarray);
    }
}