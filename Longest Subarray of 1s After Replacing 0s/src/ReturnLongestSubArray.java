public class ReturnLongestSubArray {
    public static int longestSubArray(int[] arr,int k) {

        int maximumLength = 0;
        int leftIndex = 0;
        int count = 0;

        //0,0,1,1,0,0,1,1,1,0,1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
            while (count > k) {
                if (arr[leftIndex] == 0) {
                    count--;
                }
                leftIndex++;
            }

            int length = i -leftIndex+1;
            maximumLength = Math.max(maximumLength,length);
        }
        return maximumLength;
    }
}
