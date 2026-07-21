import java.util.HashMap;
import java.util.HashSet;

public class ReturnTheMaximumNumberOfFruits {
    public static int maximumFruits(int[] tree) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int maximumFruits = 0;
        int leftIndex = 0;

        for (int i = 0; i < tree.length; i++) {
            map.put(tree[i], map.getOrDefault(tree[i], 0) + 1);

            if (map.size() <= 2){
                int length = i - leftIndex + 1;

                if (length > maximumFruits){
                    maximumFruits = length;
                }
            }

            while (map.size() > 2){
                map.put(tree[leftIndex], map.getOrDefault(tree[leftIndex], 0) - 1);
                if (map.get(tree[leftIndex]) == 0){
                    map.remove(tree[leftIndex]);
                }
                leftIndex++;
            }
        }

        return maximumFruits;
    }
}
