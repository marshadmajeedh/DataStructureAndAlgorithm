import java.util.HashMap;

public class ReturnCountOfFruits {
    public static int countOfFruits(int[] tree) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int leftIndex = 0;
        int maxLength = 0;
        //1,2,1,3,3,3
        for(int i = 0; i < tree.length; i++){
            map.put(tree[i], map.getOrDefault(tree[i], 0) + 1);

            while(map.size() > 2){
                map.put(tree[leftIndex], map.get(tree[leftIndex]) - 1);
                if(map.get(tree[leftIndex]) == 0){
                    map.remove(tree[leftIndex]);
                }
                leftIndex++;
            }
            int length = i -  leftIndex + 1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
