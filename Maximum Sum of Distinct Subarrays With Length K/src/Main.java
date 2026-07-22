import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int k = 2;
        int sum = ReturnMaximumSumInDistinctSequence.maximumSum(nums, k);
        System.out.println("maximum summation of distinct sequence in this array" +Arrays.toString(nums)+" is "+sum);
    }
}