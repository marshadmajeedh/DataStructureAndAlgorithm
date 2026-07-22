import java.util.HashMap;
import java.util.HashSet;

public class ReturnMaximumSumInDistinctSequence {
    public static int maximumSum(int[] nums,int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int maximumSum = 0;
        int sum = 0;
        int leftIndex = 0;

        //nums = [1,5,4,2,9,9,9]
        //k = 3
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
            int length = i -  leftIndex + 1;

            while (length > k || map.get(nums[i]) > 1) {
                map.put(nums[leftIndex], map.get(nums[leftIndex]) - 1);
                sum -= nums[leftIndex];

                if (map.get(nums[leftIndex]) == 0) {
                    map.remove(nums[leftIndex]);
                }
                leftIndex++;
                length = i - leftIndex + 1;
            }

            if (length == k) {
                maximumSum = Math.max(maximumSum, sum);
            }
        }
        return maximumSum;
    }
}
