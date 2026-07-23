import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] onesAndZeros = {0,0,1,1,0,0,1,1,1,0,1};
        int k = 9;

        int maximumLength = ReturnLongestSubArray.longestSubArray(onesAndZeros, k);

        System.out.println("After replacing "+k+" amount of zeros with one in this array "+ Arrays.toString(onesAndZeros)+" maximum length of consecutive ones, I cant get is : "+maximumLength);
    }
}