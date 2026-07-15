import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {};
        boolean isContainsDuplicate = IsContainsDuplicate.isContainsDuplicate(nums);
        System.out.println("Array "+ Arrays.toString(nums)+" does not contains duplicate : "+((isContainsDuplicate) ? "Yes" : "No"));
    }
}