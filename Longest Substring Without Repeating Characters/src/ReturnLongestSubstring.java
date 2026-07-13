import java.util.HashMap;
import java.util.HashSet;

public class ReturnLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int leftIndex = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            while (map.get(s.charAt(i)) > 1){
                map.put(s.charAt(leftIndex), map.get(s.charAt(leftIndex)) - 1);
                leftIndex++;
            }
            int length = i - leftIndex+1;
            maxLength = Math.max(length, maxLength);

        }
        return maxLength;
    }
}
