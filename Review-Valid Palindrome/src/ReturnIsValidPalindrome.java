public class ReturnIsValidPalindrome {
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            boolean isLeftIndexChar = Character.isLetterOrDigit(s.charAt(leftIndex));
            boolean isRightIndexChar = Character.isLetterOrDigit(s.charAt(rightIndex));

            if (!isLeftIndexChar){
                leftIndex++;
                continue;
            }
            if (!isRightIndexChar){
                rightIndex--;
                continue;
            }
            if (s.charAt(leftIndex) != s.charAt(rightIndex)){
                return false;
            }
        }
        return true;
    }
}
