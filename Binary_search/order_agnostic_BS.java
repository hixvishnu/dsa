public class order_agnostic_BS {
    public static void main(String[] args) {

    int[] arr = {18, 12, 7, 3, 1};
    int ans = orderAgnosticBS(arr, 7);
    System.out.println(ans);
        
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
    
        //Check if arr is ascending order or not
        boolean isAsc = arr[start] < arr[end];
    
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ( arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                end = mid - 1;
                } else {
                start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
}
