public class ReturnArrayWithZeroAtTheEnd {
    public static int[] zeroAtTheEnd(int[] nums) {

        int leftIndex = 0;

        //0,1,0,3,12
        //1,0,0,3,12
        //1,3,0,0,12,
        //1,3,12,0,0
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {

                while(leftIndex < nums.length && nums[leftIndex] == 0) {
                    leftIndex++;
                }
                if(leftIndex < nums.length) {
                    nums[i] = nums[leftIndex];
                    nums[leftIndex] = 0;
                }
            }else{
                leftIndex++;
            }
        }
        return nums;
    }
}
