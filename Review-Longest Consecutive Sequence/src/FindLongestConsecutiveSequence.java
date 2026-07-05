import java.util.HashSet;

public class FindLongestConsecutiveSequence {
    public static int returnLongestConsecutiveSequence(int[] arr) {

        //nums = {100,4,200,1,3,2}

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        int longest = 0;

        for(Integer i : set) {
            if (!set.contains(i-1)) {
                int count = i+1;
                while(set.contains(count)) {
                    count++;
                }
                if ((count-i) > longest) {
                    longest = count-i;
                }
            }
        }
        return longest;
    }
}
