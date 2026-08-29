import java.util.HashSet;

public class ReturnLongestConsequenceSequence {
    public static int returnLongestConsequence(int[] nums){

        int max = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i]-1)) {
                continue;
            }

            int tempI = nums[i];
            int temp = 0;

            while(set.contains(tempI)) {
                temp++;
                tempI++;
            }

            if(temp>max){
                max = temp;
            }
        }
        return max;
    }
}
