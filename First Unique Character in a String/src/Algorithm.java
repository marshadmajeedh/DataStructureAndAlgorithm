import java.util.HashMap;

public class Algorithm {
    public static int returnFirstUniqueCharacterInAString(String str) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) < 2) {
               return i;
            }
        }

        return -1;
    }
}
