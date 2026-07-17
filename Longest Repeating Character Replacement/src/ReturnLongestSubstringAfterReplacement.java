import java.util.HashMap;

public class ReturnLongestSubstringAfterReplacement {
    public static int returnLongestSubstring(String s,int k) {

        HashMap<Character, Integer> map1= new HashMap<>();

        int maxLength = 0;
        int leftIndex = 0;
        int mostFrequentElementValue = 0;

        for (int  i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            int rightIndex = i + 1;

            if (map1.get(s.charAt(i)) > mostFrequentElementValue) {
                mostFrequentElementValue = map1.get(s.charAt(i));
            }

            if (rightIndex <= s.length()) {
                int canReplaceK = rightIndex - mostFrequentElementValue;

                if (canReplaceK <= k) {
                    int length = rightIndex - leftIndex;
                    if  (length > maxLength) {
                        maxLength = length;
                    }
                }
                else {

                    int windowSize = i - leftIndex + 1;

                    while (windowSize - mostFrequentElementValue > k) {

                        map1.put(s.charAt(leftIndex), map1.getOrDefault(s.charAt(leftIndex), 0) - 1);
                        windowSize = i - leftIndex + 1;

                        leftIndex++;
                    }
                }
            }
        }
        return maxLength;
    }
}
