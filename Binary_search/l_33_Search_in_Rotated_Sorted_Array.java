public class l_33_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans); 
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == 0) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (target >= nums[0] && target <= nums[pivot - 1]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot, nums.length - 1);
        }
    }
    
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr [end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end ){
        // int start = 0;
        // int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
