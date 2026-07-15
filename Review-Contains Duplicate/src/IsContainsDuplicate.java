import java.util.HashSet;

public class IsContainsDuplicate {
    public static boolean isContainsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }
}
