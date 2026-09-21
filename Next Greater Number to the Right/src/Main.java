import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 4, 3};
        int[] answers = ReturnNextGreaterNumberToTheRight.returnNextGreaterNumberToTheRight(nums);
        System.out.println(Arrays.toString(answers));
    }
}