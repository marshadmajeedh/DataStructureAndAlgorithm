import java.util.HashMap;

public class SubArraySumEqualsK {
    public static int subarraysSumEqualsK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int currentSum = 0;
        int subArrayCount = 0;
        //1,-1,0
        //0
        for(int i = 0; i < nums.length; i++){

            currentSum += nums[i];
            int needMore = currentSum - k;

            if(map.containsKey(needMore)){
                subArrayCount += map.get(needMore);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

        }

        return subArrayCount;
    }
}
