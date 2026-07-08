import java.util.HashSet;

public class AreElementsDistinct {
    public static boolean areElementsDistinct(int[] A) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }

        return set.size() == A.length;
    }
}
