package Bubble_sort;

import java.util.Arrays;

public class bubble_sort_algo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] revArr = {5,4,3,2,1};
        bubbleSort(revArr);
        System.out.println(Arrays.toString(revArr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
     }

}
