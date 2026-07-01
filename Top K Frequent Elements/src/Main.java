import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] elements={100,100,100,2,2,2,2};
        int k = 1;
        int[] mostFrequentElements = ReturnKMostFrequentElement.returnKMostFrequentElements(elements, k);

        System.out.println(k+" most frequents from this array "+Arrays.toString(elements)+" are "+Arrays.toString(mostFrequentElements));
    }
}