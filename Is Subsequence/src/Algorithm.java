public class Algorithm {
    public static boolean isSubsequence(String s, String t) {

        int leftIndex = 0;

        for (int i = 0; i < t.length(); i++) {

            if (leftIndex < s.length() && s.toLowerCase().charAt(leftIndex) == t.toLowerCase().charAt(i)) {
                leftIndex++;
            }
            if (leftIndex == s.length()) {
                return true;
            }
        }
        return leftIndex == s.length();
    }
}
