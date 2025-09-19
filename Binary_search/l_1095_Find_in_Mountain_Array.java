
/*
Link: https://leetcode.com/problems/find-in-mountain-array/
Q.1095 Find in Mountain Array

 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }

 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1) return left;

        return binarySearch(mountainArr,target, peak+1,mountainArr.length()-1, false);
    }
        int findPeak(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid+1)) {
                 start = mid + 1;            
            } else {
                end = mid ;    
            }
        }
        return start;
        }

    int binarySearch(MountainArray arr, int target, int start, int end, boolean ascending){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // int val = arr.get(mid);
            if (target == arr.get(mid)) {
                return mid;
            }
            if (ascending) {
                if (target > arr.get(mid)) {
                    start = mid + 1;
                } else {
                end = mid -1;
                }
            }
            else{
                if (target > arr.get(mid)) {
                end = mid -1;
                } else {
                start = mid + 1;
                }
            }
        }
        return -1;
    }
}
*/

// Without Using the MountainArray Interface API -- Old Soln 

public class l_1095_Find_in_Mountain_Array {
public static void main(String[] args) {
    System.out.println("Hi");
}
}

    // Don't have to use simple int and binary search, instead use the MountainArray api

    //     public static void main(String[] args) {
    //     // mountainArr = [1,2,3,4,5,3,1], target = 3
    //     int[] arr = {1,2,3,4,5,3,1};
    //     int target = 3;
    //     int ans = findInMountain(arr, target);
    //     System.out.println(ans);
    //     }

    //     static int findInMountain(int arr[], int target){
    //         int start = 0;
    //         int end = findMaxValuePosition(arr);
    //         // int ans = -1;
    //         int firstPosition = binarySearch(arr, target, start, end);
    //         if (firstPosition < 0) {
    //             return -1;
    //         }
    //         // int lastPostion = binarySearch(arr, target, start, end);
    //         return firstPosition;
    //     }

    //     static int findMaxValuePosition(int[] arr){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start < end) {
    //         int mid = start + (end - start) / 2;
            
    //         if (arr[mid] < arr[mid + 1]) {
    //              start = mid + 1;            
    //         } else {
    //             end = mid ;    
    //         }
    //     }
    //     return start;
    //     }

    // static int binarySearch(int[] arr, int target, int start, int end){
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (tc) {
    //             start = mid + 1;
    //         }
    //         else if (target < arr[mid]) {
    //             end = mid -1;
    //         }
    //         else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }

