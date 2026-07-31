import java.util.HashMap;

public class LongestSubArray {
    //return the longest sub array of 1's after deleting exactly one element
    public static int longestSubArray(int[] nums) {

        int leftIndex = 0;
        int rightIndex = 0;
        int count = 0;
        int maxLength = 0;

        while (rightIndex < nums.length) {
            if(nums[rightIndex] == 0){
                count++;
            }

            while(count > 1){
                if(nums[leftIndex] == 0){
                    count--;
                }
                leftIndex++;
            }

            int length = (rightIndex - leftIndex + 1) - 1;
            maxLength = Math.max(maxLength, length);
            rightIndex++;
        }
        return maxLength;
    }
}
