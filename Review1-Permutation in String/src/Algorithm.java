import java.util.HashMap;

public class Algorithm {

    public static boolean checkInclusion(String s1, String s2) {

        int leftIndex = 0;

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {

            int gap = i -  leftIndex + 1;
            while (gap > s1.length()) {
                map2.put(s2.charAt(leftIndex), map2.get(s2.charAt(leftIndex)) - 1);
                if (map2.get(s2.charAt(leftIndex)) == 0) {
                    map2.remove(s2.charAt(leftIndex));
                }
                leftIndex++;
                gap = i -   leftIndex + 1;
            }
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0) + 1);

            if (map1.equals(map2)) {
                return true;
            }

        }
        return false;
    }
}