public class Main {
    public static void main(String[] args) {

        int[] binaryArray = {0,1,0,1,0,1};
        int maximumConsecutiveOnes = Algorithm.returnTheLengthOfMaximumConsecutiveOnes(binaryArray);
        System.out.println(maximumConsecutiveOnes);
    }
}