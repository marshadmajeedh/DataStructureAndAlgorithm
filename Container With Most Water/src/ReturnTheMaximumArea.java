public class ReturnTheMaximumArea {
    public static int maxArea(int[] heights) {
        int max = 0;

        int left = 0;
        int right = heights.length-1;

        while(left < right){

            int width = right - left;
            int height = Math.min(heights[left],heights[right]);

            int area = width *  height;
            max = Math.max(area, max);
            System.out.println("Left "+heights[left]+" right "+heights[right]+" area "+area);
            if(height == heights[left] && height == heights[right]){
                right--;
            } else if (height == heights[left]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
