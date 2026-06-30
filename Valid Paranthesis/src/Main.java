public class Main {
    public static void main(String[] args) {

        String s = ")";
        boolean isValidParenthesis = IsValidParenthesis.isValidParenthesis(s);

        System.out.println("Is this give String -"+s+"- has valid parenthesis : "+(isValidParenthesis ? "Yes" : "No"));
    }
}