import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        List<Integer> response1 = FindNextGreaterElement.findNextGreaterElements(nums1,nums2);
        System.out.println("The next greater elements of nums1 array "+ Arrays.toString(nums1)+ " is "+response1);
    }
}