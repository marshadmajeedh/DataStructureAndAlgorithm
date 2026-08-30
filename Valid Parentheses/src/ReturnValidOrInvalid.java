import java.util.Stack;

public class ReturnValidOrInvalid {
    public static boolean returnValidOrInvalid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' ||  s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char poppedChar = stack.pop();
                if ((poppedChar == '(' && s.charAt(i) != ')') || (poppedChar == '[' && s.charAt(i) != ']') || (poppedChar == '{' && s.charAt(i) != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
