import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {-1,-1,-2,-2,-2};
        int[] topKFreq = ReturnTopKFrequentElement.topKFrequent(nums,1);
        System.out.println(Arrays.toString(topKFreq));
    }
}