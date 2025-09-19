/*
Q: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
852. Peak Index in a Mountain Array
 */

public class l_852_Peak_Index_in_a_Mountain_Array {
        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 1};
        int ans = binarySearch(arr);
        System.out.println(arr[ans]);
        }

    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                 start = mid + 1;            
            } else {
                end = mid ;    
            }
        }
        return start;
    }
}
