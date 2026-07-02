import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[]numbers = {1,2};
        int targetSum = 3;
        int[] indices = FIndTwoNumbersSumToTarget.findTwoNumbersSum(numbers, targetSum);

        System.out.println ("Two indices sum up to target "+targetSum+" are "+ Arrays.toString(indices));
    }
}