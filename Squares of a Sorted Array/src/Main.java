import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[]numbers = {-2, 0, 2};
        int[] result = Algorithm.squaresOfEachInt(numbers);
        System.out.println(Arrays.toString(result));
    }
}