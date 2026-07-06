public class Main {
    public static void main(String[] args) {

        String s = "Madam";
        boolean isValidPalindrome = IsValidPalindrome.isValidPalindrome(s);
        System.out.println("Given String "+s+" is a valid palindrome : "+(isValidPalindrome? "yes":"No"));
    }
}