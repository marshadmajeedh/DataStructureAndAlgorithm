public class ReturnThePeakElement {
    public static int returnPeakElement(int[] heights) {

        if (heights.length == 1) {
            return 0;
        }
        //1,2,1,3,5,6,4
        int left = 0;
        int right = heights.length - 1;
        int mid = heights.length / 2;

        while (left < right) {

            if (right - left + 1 == 2) {
                if (heights[right] > heights[left]) {
                    return right;
                } else {
                    return left;
                }
            }

            if(heights[mid] > heights[mid-1] &&  heights[mid] > heights[mid+1]){
                return mid;
            }

            if(heights[mid + 1] > heights[mid]){
                left = mid + 1;
                mid = left + (right - left)/2;
            } else if (heights[mid - 1] >  heights[mid]){
                right = mid - 1;
                mid = left + (right - left)/2;
            }
        }
        return mid;
    }

}
