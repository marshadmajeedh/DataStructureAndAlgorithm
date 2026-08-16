import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] heights = {2,2,2,2};
        List<Integer> list = ReturnLargestRectangleInHistogram.largestRectangleArea(heights);
        System.out.println(list);
    }
}