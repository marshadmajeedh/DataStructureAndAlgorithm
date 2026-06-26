import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]numbers = {0, 1, 2};

        int missingNumber = TheVanishingInteger.findMissingInteger(numbers);

        if (missingNumber == -2){
            System.out.println("Array is null,"+Arrays.toString(numbers));
            return;
        }

        System.out.println("Missing number is "+missingNumber+" from array ,"+Arrays.toString(numbers));
    }
}