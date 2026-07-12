import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[]numbers = {3,2,3};
        System.out.println("Majority element in this array is : "+Arrays.toString(numbers)+" , "+ReturnMajorityElement.majorityElement(numbers));
    }
}