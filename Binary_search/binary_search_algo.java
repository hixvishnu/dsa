public class binary_search_algo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 16, 20};
        int target = 20;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            // if target is greater than middle element
            if (target > arr[mid]) {
                start = mid + 1;
            }
            // else if target is less than middle element
            else if (target < arr[mid]) {
                end = mid -1;
            }
            // ans found return mid
            else{
                return mid;
            }
        }
        return -1;
    }
}
