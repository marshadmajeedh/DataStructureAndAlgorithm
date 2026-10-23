import java.util.HashSet;

public class Algorithm {
    public static boolean isContainsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int j : arr) {

            if (!set.add(j)) {
                return true;
            }
        }
        return false;
    }
}
