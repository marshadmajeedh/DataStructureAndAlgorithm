import java.util.Stack;

public class IsValidParenthesis {
    public static boolean isValidParenthesis(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char poppedChar =  stack.pop();
                if ((poppedChar == '(' &&  c != ')') ||(poppedChar == '[' &&  c != ']') || (poppedChar == '{' &&  c != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
