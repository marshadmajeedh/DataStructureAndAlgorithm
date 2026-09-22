import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[]  stocks = {30,20,25,28,27,29};
        int[] stocksSpan = StockSpan.returnStockSpan(stocks);
        System.out.println(Arrays.toString(stocksSpan));
    }
}