public class Main {
    public static void main(String[] args) {

        String s = ".,";
        boolean isValidPalindrome = ReturnIsValidPalindrome.isPalindrome(s);
        System.out.println("String '"+s+"' is a valid palindrome ? "+((isValidPalindrome) ? "Yes" : "No"));
    }
}