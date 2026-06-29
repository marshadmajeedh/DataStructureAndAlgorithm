import java.util.HashSet;

public class FindLongestConsecutiveStreak {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if (nums.length == 0) return 0;

        int maxLength = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (Integer num : set) {
            int value = num - 1;

            if (!set.contains(value)) {
                int newValue = num +1;
                while (set.contains(newValue)) {
                    newValue++;
                }

                int length = newValue - num;
                if (length > maxLength) {
                    maxLength = length;
                }
            }

        }
        return maxLength;
    }
}
