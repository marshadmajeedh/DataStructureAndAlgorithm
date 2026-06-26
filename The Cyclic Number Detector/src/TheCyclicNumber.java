import java.util.HashSet;

public class TheCyclicNumber {
    public static boolean theCyclicNumber(int n) {
        HashSet<Integer> set = new HashSet<>();

        if(n == 1){
            return true;
        }

        while (n != 1){
            if (!set.add(n)){
                return false;
            }

            int temp = 0;
            String number =  Integer.toString(n);
            for (int i = 0; i < number.length(); i++) {
                int value = number.charAt(i) - '0';
                temp += value * value;
            }
            n = temp;
        }
        return true;
    }
}
