public class Algorithm {
    public static int firstOccurrence(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        //0 1 2 3 4 5
        //1,2,2,2,3,4
        while(left < right){
            int mid = (left+right)/2;

            if (nums[mid] >= target){
                right = mid-1;
            } else if (nums[mid] < target){
                left = mid+1;
            } else {
                return mid;
            }
        }
        if (nums[left] == target){
            return left;
        }
        return -1;
    }
}
