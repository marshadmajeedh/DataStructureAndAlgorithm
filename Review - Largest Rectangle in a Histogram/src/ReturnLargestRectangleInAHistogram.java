
import java.util.HashMap;
import java.util.Stack;

public class ReturnLargestRectangleInAHistogram {
    public static int returnLargestRectangle(int[] heights) {

        if (heights == null || heights.length == 0) {
            return 0;
        }

        Stack<Integer> stackLeftToRight = new Stack<>();
        Stack<Integer> stackRightToLeft = new Stack<>();

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        //2,2,2
        int maxAreaOfRectangle = -1;

        for(int i = 0; i < heights.length; i++){
            while(!stackLeftToRight.isEmpty() && heights[stackLeftToRight.peek()] > heights[i]){
               map1.put(stackLeftToRight.pop(),i);
            }

            while(!stackRightToLeft.isEmpty() &&  heights[stackRightToLeft.peek()] > heights[heights.length-i-1]){
                map2.put(stackRightToLeft.pop(),heights.length-i-1);
            }

            stackLeftToRight.push(i);
            stackRightToLeft.push(heights.length-i-1);

        }
        System.out.println("HashMap 1 :"+map1);
        System.out.println("HashMap 2 :"+map2);

        for(int i = 0; i < heights.length; i++){

            if(map1.containsKey(i) && !map2.containsKey(i)){

                int right = map1.get(i);
                int left = -1;
                int width = right - left - 1;
                int area = heights[i] * width;

                if(area > maxAreaOfRectangle){
                    maxAreaOfRectangle = area;
                }

            } else if(map2.containsKey(i) &&  !map1.containsKey(i)){
                int right = heights.length;
                int left = map2.get(i);
                int width = right - left - 1;
                int area = heights[i] * width;
                if(area > maxAreaOfRectangle){
                    maxAreaOfRectangle = area;
                }

            } else if(map1.containsKey(i) &&  map2.containsKey(i)){
                int right = map1.get(i);
                int left = map2.get(i);
                int width = right - left - 1;
                int area = heights[i] * width;

                if(area > maxAreaOfRectangle){
                    maxAreaOfRectangle = area;
                }
            } else {
                int right =  heights.length;
                int left = -1;
                int width = right - left - 1;
                int area = heights[i] * width;

                if(area > maxAreaOfRectangle){
                    maxAreaOfRectangle = area;
                }
            }
        }

        return maxAreaOfRectangle;

    }
}
