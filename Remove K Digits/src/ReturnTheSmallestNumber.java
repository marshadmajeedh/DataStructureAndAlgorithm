import java.util.Stack;

public class ReturnTheSmallestNumber {
    public static String smallestNumber(String nums,int k) {

        int smallestNumberLength = nums.length() - k;
        int lastIndex = 0;
        int tempK = k;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < nums.length(); i++) {

            while (!stack.isEmpty() && tempK != 0 && stack.peek() > nums.charAt(i)) {
                stack.pop();
                tempK--;
            }

            if(tempK > 0){
                stack.push(nums.charAt(i));
                lastIndex = i;
            }
        }

        if(k != tempK) {
            lastIndex++;
        }

        StringBuilder sb1 = new StringBuilder();

        while (!stack.isEmpty() && stack.size() > smallestNumberLength) {
            stack.pop();
        }

        while (!stack.isEmpty()){
            sb1.append(stack.pop());
        }

        sb1.reverse();

        while(lastIndex < nums.length() && sb1.length() < smallestNumberLength){
            sb1.append(nums.charAt(lastIndex++));
        }

        String copy =  sb1.toString();
        int i = 0;

        while(i < copy.length() && copy.charAt(i) == '0'){
            i++;
        }

        StringBuilder sb2 = new StringBuilder();

        while(i < copy.length()){
            sb2.append(copy.charAt(i++));
        }

        if(sb2.isEmpty()){
            sb2.append('0');
        }

        return sb2.toString();
    }
}
