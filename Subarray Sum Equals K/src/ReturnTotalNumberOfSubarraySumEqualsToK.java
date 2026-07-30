import java.util.HashMap;

public class ReturnTotalNumberOfSubarraySumEqualsToK {
    public static int totalNumberOfSubarrays(int[] nums, int k) {
        //nums = {1,1,1,2}
        //k=2
        //2

        //nums = {1,-1,1}
        //k=0
        //2

        //nums = {0,0}
        //k=0
        //3

        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            int previousPrefix = prefixSum;
            prefixSum += num;

            map.put(previousPrefix,map.getOrDefault(previousPrefix,0)+1);

            int neededPrefix = prefixSum - k;

            if (map.containsKey(neededPrefix)) {
                count +=  map.get(neededPrefix);
            }
        }

        return count;
    }
}
