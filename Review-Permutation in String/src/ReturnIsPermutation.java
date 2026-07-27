import java.util.HashMap;

public class ReturnIsPermutation {
    public static boolean isPermutation(String s1, String s2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int leftIndex = 0;

        //ab
        //eidaooob

        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);

            while(i - leftIndex + 1 > s1.length()) {
                map2.put(s2.charAt(leftIndex), map2.get(s2.charAt(leftIndex))-1);
                if(map2.get(s2.charAt(leftIndex)) == 0) {
                    map2.remove(s2.charAt(leftIndex));
                }
                leftIndex++;
            }

            if(map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}
