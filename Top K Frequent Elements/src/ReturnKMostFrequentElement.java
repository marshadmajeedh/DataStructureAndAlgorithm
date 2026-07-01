import java.util.HashMap;
import java.util.Map;

public class ReturnKMostFrequentElement {
    public static int[] returnKMostFrequentElements(int[] arr, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] mostFrequentElements = new int[k];

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        int count = 0;

        while (count < k) {
          int max = 0;
          int key = 0;

          for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
              if (entry.getValue() > max) {
                  max = entry.getValue();
                  key = entry.getKey();
              }
          }

          mostFrequentElements[count++] = key;
          map.remove(key);
        }
        return mostFrequentElements;
    }
}
