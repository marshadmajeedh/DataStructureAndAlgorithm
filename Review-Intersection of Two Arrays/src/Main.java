import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        HashSet<Integer> intersection = ReturnIntersectionsOfTwoArrays.intersections(num1,num2);
        System.out.println(intersection);
    }
}