public class Main {
    public static void main(String[] args) {
        String s = "({[]})";
        boolean isValidParentheses = ReturnValidOrInvalid.returnValidOrInvalid(s);
        System.out.println("String "+s+" has valid parentheses : "+(isValidParentheses? "Yes":"No"));
    }
}