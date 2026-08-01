import java.util.HashMap;

public class ReturnBinarySubArraysWithSum {
    public static int totalSubarraySum(int[] nums, int goal) {

        int count = 0;
        int prefixSum = 0;
        int rightIndex = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        //1,0,1,0,1

        while (rightIndex < nums.length) {

            int previousPrefixSum = prefixSum;
            prefixSum += nums[rightIndex];

            int neededGoal = prefixSum - goal;

            map.put(previousPrefixSum, map.getOrDefault(previousPrefixSum, 0) + 1);

            if (map.containsKey(neededGoal)) {
                count += map.get(neededGoal);
            }

            rightIndex++;
        }

        return count;
    }
}
