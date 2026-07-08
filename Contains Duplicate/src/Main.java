import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {};
        boolean isDistinct = AreElementsDistinct.areElementsDistinct(nums);
        System.out.println("Given array "+Arrays.toString(nums)+" has distinct elements : "+(isDistinct ? "Yes":"No"));
    }
}