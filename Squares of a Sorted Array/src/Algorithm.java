public class Algorithm {
    public static int[] squaresOfEachInt(int[] numbers){

        int[] result = new int[numbers.length];
        int right = numbers.length-1;
        int left = 0;
        int pointer = numbers.length-1;

        while (pointer >= 0){

            int leftSquare =  numbers[left] *  numbers[left];
            int rightSquare = numbers[right] *   numbers[right];

            if (leftSquare >  rightSquare){
                result[pointer--] = leftSquare;
                left++;
            } else {
                result[pointer--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}
