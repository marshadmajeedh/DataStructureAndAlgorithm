import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] tree = {0,1,2,2,3,3,2,2};
        int maximumFruits = ReturnTheMaximumNumberOfFruits.maximumFruits(tree);

        System.out.println("Maximum number of (2 types)fruits tht i can pick from this tree "+ Arrays.toString(tree)+" is "+ maximumFruits);
    }
}