import java.util.HashMap;
import java.util.Map;

public class ReturnTopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {

        int[] topKFrequent = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        while (index < k) {
            int maxKey = 0;
            int maxValue = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxKey = entry.getKey();
                    maxValue = entry.getValue();
                }
            }

            topKFrequent[index++] = maxKey;
            map.remove(maxKey);
        }
        System.out.println (map);
        return topKFrequent;
    }
}
