import java.util.HashMap;

public class ReturnMajorityElement {
    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxValue = 0;
        int maxKey = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxKey = key;
                maxValue = map.get(key);
            }
        }
        return maxKey;
    }
}
