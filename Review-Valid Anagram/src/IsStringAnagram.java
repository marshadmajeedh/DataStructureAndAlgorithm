import java.util.HashSet;

public class IsStringAnagram {
    public static boolean isAnagramOfS(String s, String t) {
        if (s.length() != t.length()) return false;

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (set.add(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
