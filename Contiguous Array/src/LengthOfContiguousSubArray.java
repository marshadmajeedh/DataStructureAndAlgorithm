import java.util.HashMap;

public class LengthOfContiguousSubArray {
    //given a binary array, return the maximum length of a contiguous subarray with an equal number of 0s and 1s.
    public static int maxLengthOfAContiguousSubArray(int[] binary) {

        int maxLength = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0;i < binary.length; i++){

            if (binary[i] == 0)
            {
                prefixSum += -1;
            }

            else
            {
                prefixSum += 1;
            }

            if(map.containsKey(prefixSum)){

                maxLength = Math.max(maxLength, i - map.get(prefixSum));

            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
