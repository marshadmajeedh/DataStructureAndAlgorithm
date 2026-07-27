import java.util.HashMap;

public class ReturnMaximumSum {
    public static int maxSum(int[] arr, int k) {

        int sum = 0;
        int tempSum = 0;
        int leftIndex = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        //1,5,4,2,9,9,9

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            tempSum += arr[i];
            int length = i - leftIndex + 1;

            while(length > k  || map.get(arr[i]) > 1){
                map.put(arr[leftIndex], map.get(arr[leftIndex]) - 1);
                tempSum -= arr[leftIndex];
                if(map.get(arr[leftIndex]) == 0){
                    map.remove(arr[leftIndex]);
                }
                leftIndex++;
                length =  i - leftIndex + 1;
            }
            sum = Math.max(sum, tempSum);
        }
        return sum;
    }
}
