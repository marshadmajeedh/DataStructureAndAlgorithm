import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strings) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strings) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return  new ArrayList<>(map.values());
    }
}
