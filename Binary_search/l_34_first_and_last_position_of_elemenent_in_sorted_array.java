import java.util.Arrays;

public class l_34_first_and_last_position_of_elemenent_in_sorted_array {
        public static void main(String[] args) {
        int[] nums = {2, 4, 5,8,8, 8, 8, 9, 12};
        int target = 8;
        int[] arr = searchRange(nums, target);
            System.out.println(Arrays.toString(arr));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1}; 
        int[] arr = nums;
        int find = target;
        res[0] = firstPosition(arr, find);
        res[1] = lastPosition(arr, find);
        return res;
    }
    static int firstPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int firstPos = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                firstPos = mid;
                end = mid - 1;
            } else if(target < nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstPos;
    }
    static int lastPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int lastPos = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                lastPos = mid;
                start = mid + 1;
            } else if(target < nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lastPos;
    }
}
        
