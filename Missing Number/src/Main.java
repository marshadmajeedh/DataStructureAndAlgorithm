import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers= {9,6,4,2,3,5,7,0,1};
        int missingNumber = ReturnMissingNumber.missingNumber(numbers);
        System.out.println("Missing number from this array "+ Arrays.toString(numbers)+" is ,"+missingNumber);
    }
}