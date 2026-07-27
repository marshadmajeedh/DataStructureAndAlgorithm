public class Main {
    public static void main(String[] args) {
        int[] nums= {1,5,4,2,9,9,9};
        int k = 3;
        int maximumLength = ReturnMaximumSum.maxSum(nums, k);
        System.out.println(maximumLength);
    }
}