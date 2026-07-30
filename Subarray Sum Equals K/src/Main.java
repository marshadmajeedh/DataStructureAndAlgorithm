public class Main {
    public static void main(String[] args) {

        int[] nums = {0,0,0};
        int k = 0;

        int counts = ReturnTotalNumberOfSubarraySumEqualsToK.totalNumberOfSubarrays(nums, k);
        System.out.println ("Count of subarrays that sum up equal to k '"+k+"' is: "+counts);
    }
}