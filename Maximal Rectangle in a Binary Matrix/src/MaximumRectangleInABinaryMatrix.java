import java.util.HashMap;
import java.util.Stack;

public class MaximumRectangleInABinaryMatrix {
    public static int returnMaximumRectangle(char[][] matrix) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        int maximumRectangleInABinaryMatrix = Integer.MIN_VALUE;

        int[] convertToNormalArray = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                int charToInt = matrix[i][j] - '0';

                if(charToInt == 0){
                    convertToNormalArray[j] = 0;
                } else {
                    convertToNormalArray[j] += 1;
                }
            }

            for (int k = 0; k < convertToNormalArray.length; k++) {

                while(!stack1.isEmpty() && convertToNormalArray[stack1.peek()] > convertToNormalArray[k]){
                    map1.put(stack1.pop(), k);
                }

                while(!stack2.isEmpty() && convertToNormalArray[stack2.peek()] > convertToNormalArray[convertToNormalArray.length - k - 1]){
                    map2.put(stack2.pop(),convertToNormalArray.length - k - 1 );
                }
                stack1.push(k);
                stack2.push(convertToNormalArray.length - k - 1);
            }

            stack1.clear();
            stack2.clear();

            for (int k = 0; k < convertToNormalArray.length; k++) {

                if (map1.containsKey(k) && !map2.containsKey(k)) {
                    int right = map1.get(k);
                    int left = -1;
                    int width = right - left - 1;
                    int height = convertToNormalArray[k];

                    int area = width * height;
                    maximumRectangleInABinaryMatrix = Math.max(maximumRectangleInABinaryMatrix, area);
                } else if(!map1.containsKey(k) && map2.containsKey(k)){
                    int right = convertToNormalArray.length;
                    int left = map2.get(k);
                    int width = right - left - 1;
                    int height = convertToNormalArray[k];

                    int area = width * height;
                    maximumRectangleInABinaryMatrix = Math.max(maximumRectangleInABinaryMatrix, area);
                } else if(map1.containsKey(k) && map2.containsKey(k)){
                    int right = map1.get(k);
                    int left = map2.get(k);
                    int width = right - left - 1;
                    int height = convertToNormalArray[k];

                    int area = width * height;
                    maximumRectangleInABinaryMatrix = Math.max(maximumRectangleInABinaryMatrix, area);
                } else {
                    int right = convertToNormalArray.length;
                    int left = -1;
                    int width = right - left - 1;
                    int height = convertToNormalArray[k];
                    int area = width * height;
                    maximumRectangleInABinaryMatrix = Math.max(maximumRectangleInABinaryMatrix, area);
                }
            }
            map1.clear();
            map2.clear();
        }
        return maximumRectangleInABinaryMatrix;
    }
}
