public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,0,1};
        int maxCount = ReturnTheLengthOfLongestConsecutiveSequence.longestConsecutive(nums);

        System.out.println("Maximum length of a consecutive sequence is : "+maxCount);
    }
}