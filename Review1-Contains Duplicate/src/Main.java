import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers  = {1,2,3,4};

        boolean containsDuplicate = Algorithm.isContainsDuplicate(numbers);
        System.out.println("Array "+ Arrays.toString(numbers)+ " Contains Duplicate : "+(containsDuplicate ? "Yes" : "No"));
    }
}