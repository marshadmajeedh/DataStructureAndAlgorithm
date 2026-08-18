import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int evaluationResult(String[] tokens){

        int result = 0;

        Stack<Integer> stack = new Stack<>();
        boolean firstExpression = false;

        for(int i = 0; i < tokens.length; i++){
            boolean found = false;
            //"42"
            while(!stack.isEmpty() && !found && (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))){
                switch(tokens[i]) {
                    case "+":
                        if (!firstExpression) {
                            if(stack.size() < 2)break;

                            int firstPopped = stack.pop();
                            int secondPopped = stack.pop();

                            result = firstPopped + secondPopped;
                            firstExpression = true;
                            found = true;
                            break;
                        }

                        result += stack.pop();
                        found = true;
                        break;

                    case "*":
                        if (!firstExpression) {

                            if(stack.size() < 2)break;
                            int firstPopped = stack.pop();
                            int secondPopped = stack.pop();

                            result = firstPopped * secondPopped;
                            firstExpression = true;
                            found = true;
                            break;
                        }

                        result *= stack.pop();
                        found = true;
                        break;

                    case  "/":
                        if (!firstExpression) {

                            if(stack.size() < 2)break;

                            int firstPopped = stack.pop();
                            int secondPopped = stack.pop();

                            if (firstPopped == 0) {
                                throw new ArithmeticException("Cannot divide by zero");
                            }
                            result = secondPopped / firstPopped;
                            firstExpression = true;
                            found = true;
                            break;
                        }

                        if(result == 0){
                            throw new ArithmeticException("Cannot divide by zero");
                        }

                        result = stack.pop() / result;
                        found = true;
                        break;

                    case "-":
                        if (!firstExpression) {

                            if(stack.size() < 2)break;
                            int firstPopped = stack.pop();
                            int secondPopped = stack.pop();

                            result = secondPopped - firstPopped;
                            firstExpression = true;
                            found = true;
                            break;
                        }
                        result = stack.pop() - result;
                        found = true;
                        break;

                    default:
                        System.out.println("+++++++++++++++++++");
                }

            }

            if(!found){
                stack.push(Integer.parseInt(tokens[i]));
                if(tokens.length == 1){
                    return stack.pop();
                }
            }

        }

        return result;
    }
}
