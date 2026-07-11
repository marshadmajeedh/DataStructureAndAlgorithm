import java.util.HashMap;
import java.util.HashSet;

public class IsIsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i)) && !set.add(t.charAt(i))) {
                return false;
            } else if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }
        System.out.println(map);
        return true;
    }
}
