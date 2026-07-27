import java.util.HashMap;

public class ReturnLongestSubarray {
    public static int longestSubarray(int[] nums,int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int leftIndex = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0){
                count++;
            }

            while(count > k){

                if(nums[leftIndex] == 0){
                    count--;
                }
                leftIndex++;
            }
            int length = i - leftIndex + 1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
