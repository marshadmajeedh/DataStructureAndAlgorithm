import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        List<Integer> response = FindNextGreaterElement.findNextGreaterElement(nums);
        System.out.println("circular array : "+response);
    }
}