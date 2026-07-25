import java.util.HashMap;

public class ReturnTheLongestSubstring {
    //return the longest substring after replacing at most k characters
    public static int returnTheLongestSubstring(String s,int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int maxValue = 0;
        char maxValueChar = s.charAt(0);
        int leftIndex = 0;
        int maxLength = 0;
        //AABABBBBBB
        //1
        //8
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            if (map.get(s.charAt(i)) > maxValue) {
                maxValue = map.get(s.charAt(i));
                maxValueChar = s.charAt(i);
            }

            while ((i - leftIndex + 1)-maxValue> k){

                map.put(s.charAt(leftIndex), map.get(s.charAt(leftIndex))-1);

                if(s.charAt(leftIndex) == maxValueChar){
                    maxValue--;
                }

                if(map.get(s.charAt(leftIndex)) ==0){
                    map.remove(s.charAt(leftIndex));
                }

                leftIndex++;

                if (map.get(s.charAt(leftIndex)) > maxValue){
                    maxValue = map.get(s.charAt(leftIndex));
                    maxValueChar = s.charAt(leftIndex);
                }

            }
            int length = i -  leftIndex +1 ;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
