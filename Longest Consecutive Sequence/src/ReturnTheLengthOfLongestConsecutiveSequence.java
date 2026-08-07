import java.util.HashMap;

public class ReturnTheLengthOfLongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int count = 0;

        //100,4,200,1,3,2
        for (int key : map.keySet()) {

            int k = key - 1;
            if(map.containsKey(k)){
                continue;
            }

            int i = 0;
            int j = key + i;
            while(map.containsKey(j)){
                count++;
                i++;
                j = key + i;
            }
            maxCount = Math.max(maxCount, count);
            count = 0;
        }

        return maxCount;
    }
}
