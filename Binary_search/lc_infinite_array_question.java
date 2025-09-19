// Geek for geek question 
// have some issue in the initial sol

public class lc_infinite_array_question {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 21, 24, 36, 63, 82};
        int target = 10;
        int ans = findingRange(arr, target);
        System.out.println(ans);
    }

    static int findingRange(int[] ans, int target){
        int start = 0;
        int end = 1;

        while (target > ans[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1)*2; // Doubling the box of the size each time 
            start = newStart;
        }

        return binarySearch(ans, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
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
