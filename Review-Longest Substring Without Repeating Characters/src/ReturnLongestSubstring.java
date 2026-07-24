import java.util.HashMap;

public class ReturnLongestSubstring {
    //return the longest without repeating characters
    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int leftIndex = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            while (map.get(s.charAt(i)) > 1){
                map.put(s.charAt(leftIndex), map.get(s.charAt(leftIndex)) - 1);
                leftIndex++;
            }
            int length =  i - leftIndex + 1;

            if (length > maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }
}
