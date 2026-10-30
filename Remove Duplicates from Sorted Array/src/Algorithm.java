import java.util.Arrays;
import java.util.HashSet;

public class Algorithm {
    public static int uniqueElements(int[] numbers){

        //0,0,1,1,1,2,2,3,3,4
        int leftIndex = 0;

        for (int i = 1; i < numbers.length; i++) {

            if(numbers[i] != numbers[leftIndex]){
                leftIndex++;
                numbers[leftIndex] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        return leftIndex + 1;
    }

}