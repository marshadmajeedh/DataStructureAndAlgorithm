import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"",""};
        System.out.println("Anagrams of this array "+ Arrays.toString(strings)+" are "+GroupAnagrams.groupAnagrams(strings));
    }
}