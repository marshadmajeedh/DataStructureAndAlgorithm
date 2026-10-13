import java.util.HashMap;

public class ReturnLongestSubstringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maximumLength = Integer.MIN_VALUE;

        //abcabcbb
        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            while(map.get(s.charAt(i)) > 1) {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);

                if(map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }

            int length = i - left + 1;
            maximumLength = Math.max(maximumLength, length);
        }

        if(s.isEmpty()){
            return 0;
        }
        return maximumLength;
    }
}
