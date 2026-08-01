public class Main {
    public static void main(String[] args) {

        int[] binary = {1,0,1,0,1};
        int goal = 2;

        System.out.println("Total binary sub arrays that sum equals '"+goal+"' is : "+ReturnBinarySubArraysWithSum.totalSubarraySum(binary,goal));
    }
}