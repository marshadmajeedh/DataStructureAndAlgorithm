public class Algorithm {

    public static int sumOfDigits(int n) {

        int sum = 0;
        sum += n % 10;

        if (n == 0){
            return sum;
        }

        n /= 10;
        return sumOfDigits(n) + sum ;
    }
}