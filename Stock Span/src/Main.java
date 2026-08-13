import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] stocks = {100, 80, 60, 70, 60, 75, 85};
        int[] results = ReturnStockSpan.stockSpans(stocks);
        System.out.println(Arrays.toString(results));
    }
}