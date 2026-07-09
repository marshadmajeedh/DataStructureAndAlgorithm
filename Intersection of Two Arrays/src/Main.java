import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {};
        int[] nums2 = {};
        HashSet<Integer> intersections = ReturnIntersectionOfTwoArrays.returnIntersection(nums1, nums2);
        System.out.println("Intersections of array "+ Arrays.toString(nums1)+" and array "+Arrays.toString(nums2)+" is "+intersections);
    }
}