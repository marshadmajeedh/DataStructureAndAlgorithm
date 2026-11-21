import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Algorithm {

    //int[] numbers = {-1, 0, 1, 2, -1, -4};
    //-4,-1,-1,0,1,2
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> response = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int right = nums.length - 1;
            int left = i + 1;

            while (left < right) {
                int wholeSum = nums[i] + nums[left] + nums[right];

                if(wholeSum == 0) {
                    List<Integer> trackerList = new ArrayList<>();

                    trackerList.add(nums[i]);
                    trackerList.add(nums[left]);
                    trackerList.add(nums[right]);

                    if(set.add(trackerList)) {
                        response.add(trackerList);
                    }
                    left++;
                    right--;
                } else if(wholeSum > 0){
                    right--;
                } else {
                    left++;
                }
            }

        }
        return  response;
    }
}