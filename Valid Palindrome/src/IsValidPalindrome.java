public class IsValidPalindrome {
    public static boolean isValidPalindrome(String string) {

        StringBuilder s = new StringBuilder();
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char c  = string.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                s.append(c);
            }
        }

        int rightIndex = s.length() - 1;
        int leftIndex = 0;

        while (leftIndex < rightIndex){
            if (s.charAt(leftIndex) != s.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
