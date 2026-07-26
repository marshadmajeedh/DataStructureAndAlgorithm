public class Main {
    public static void main(String[] args) {
        int[] nums ={2,3,1,2,4,3};
        int k = 7;
        int minimumLengthOfSubArray = FindTheSmallestLengthOfContiguousSubArray.lengthOfContiguousSubArray(nums,k);
        System.out.println(minimumLengthOfSubArray);
    }
}