public class Algorithm {
    public static int returnTheLengthOfMaximumConsecutiveOnes(int[] nums) {

        int leftIndex = 0;
        int maximumConsecutiveOnes = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
               leftIndex = i + 1;
               continue;
            }

            int length = i - leftIndex + 1;
            if(length > maximumConsecutiveOnes){
                maximumConsecutiveOnes = length;
            }
        }
        return maximumConsecutiveOnes;
    }
}
