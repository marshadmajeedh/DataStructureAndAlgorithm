import java.util.HashSet;

public class ReturnIsCyclicNumber {
    public static boolean isCyclic(int n) {
        String s = Integer.toString(n);

        HashSet<Integer> set = new HashSet<>();
        set.add(n);

        if(n ==1){
            return true;
        }

        while(true){
            int sum = 0;

            for (int i = 0; i < s.length(); i++){
                int squareOfI = Integer.parseInt(String.valueOf(s.charAt(i))) * Integer.parseInt(String.valueOf(s.charAt(i)));
                sum += squareOfI;
            }

            if(!set.add(sum)){
                return false;
            }

            if(sum == 1){
                return true;
            }
            s = Integer.toString(sum);
        }
    }
}
