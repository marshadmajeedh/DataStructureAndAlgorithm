public class FindTheSmallestLengthOfContiguousSubArray {
    //find the smallest length of contiguous subarray whose sum is >= target
    public static int lengthOfContiguousSubArray(int[] nums,int k) {

        int left =  0;
        int right = 0;

        int sum = 0;
        int minimumLength = nums.length+1;
        //2,3,1,2,4,3
        //7
        //2
        while (right < nums.length) {
            sum += nums[right];

            while (sum >= k) {
                minimumLength = Math.min(minimumLength, right - left + 1);
                sum -= nums[left++];

            }
            right++;
        }

        if (minimumLength == nums.length+1){
            return  0;
        }
        return minimumLength;
    }
}
