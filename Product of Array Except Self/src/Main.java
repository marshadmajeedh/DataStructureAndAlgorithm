import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};
        int[] answers = FindProductOfArrayExceptSelf.productExceptSelf(numbers);

        System.out.println("Given array is : "+Arrays.toString(numbers));
        System.out.println("Resulting  array is : "+Arrays.toString(answers));
    }
}