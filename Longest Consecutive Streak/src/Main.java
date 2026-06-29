import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {-2,-1,0,1,5};
        int length = FindLongestConsecutiveStreak.longestConsecutive(array);
        System.out.println("Longest Consecutive Streak in "+ Arrays.toString(array)+" array is " + length);
    }
}