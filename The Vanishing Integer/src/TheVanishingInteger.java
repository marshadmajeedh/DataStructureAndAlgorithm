public class TheVanishingInteger {

    public static int findMissingInteger(int[]nums){

        if(nums==null||nums.length==0){
            return -2;
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1 ; i < nums.length+1 ; i++) {
            sum1 += i ;
        }

        for (int num : nums) {
            sum2 += num;
        }

        return sum1 - sum2;
    }
}
