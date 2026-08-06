import java.util.HashMap;

public class ReturnLongestSubarrayWithSumEqualsK {
    public static int longestSubarray(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int preFixSum = 0;
        int maxLength = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            preFixSum += nums[i];

            int neededPrefix = preFixSum - k;
            //3
            //1, -1, 5, -2, 3
            if (map.containsKey(neededPrefix)) {
                int length = i -  map.get(neededPrefix);
                if (length > maxLength) {
                    maxLength = length;
                }
            }else if (!map.containsKey(preFixSum)) {
                map.put(preFixSum, i);
            }


        }

        return maxLength;
    }
}
