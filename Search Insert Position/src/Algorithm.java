public class Algorithm {
    public static int returnIndex(int[]nums,int target){

        int left = 0;
        int right = nums.length-1;

        //0//1,3,5,6
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]>target){
                right = mid - 1;
            } else if(nums[mid]<target){
                left = mid + 1;
            }
        }

        if(nums[left]==target){
            return left;
        } else if(nums[left] < target){
            return left  + 1;
        } else {
            return left;
        }
    }
}
