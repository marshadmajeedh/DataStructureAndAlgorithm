import java.util.ArrayList;
import java.util.HashSet;

public class ReturnIntersectionOfTwoArrays {
    public static HashSet<Integer> returnIntersection(int[]nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();


        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (!set1.add(num)) {
                set2.add(num);
            }
        }
        return set2;
    }
}
