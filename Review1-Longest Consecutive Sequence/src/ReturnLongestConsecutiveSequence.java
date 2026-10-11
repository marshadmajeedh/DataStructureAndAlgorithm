import java.util.HashSet;

public class ReturnLongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums.length == 0) return 0;
        for  (int num : nums) {
            set.add(num);
        }

        int maxLongestConsecutive = 1;
        //[100, 4, 200, 1, 3, 2]
        for (int num : set){

            if (set.contains(num-1)){
                continue;
            }

            int count = 1;
            int contains = num + 1;
            while(set.contains(contains)){
                count++;
                contains = contains + 1;
            }
            maxLongestConsecutive = Math.max(maxLongestConsecutive, count);
        }

        return maxLongestConsecutive;
    }
}
