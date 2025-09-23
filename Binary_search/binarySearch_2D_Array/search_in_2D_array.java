package binarySearch_2D_Array;

import java.util.Arrays;

public class search_in_2D_array {
    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(searchInMatrix(arr, 37)));
        
    }

    static int[] searchInMatrix(int[][] Matrix, int target){
	int row = 0;
	int col = Matrix.length -1;
	while(row < Matrix.length && col >=0){
		if(Matrix[row][col] == target){
			return new int[]{row,col};
		}

		if(Matrix[row][col] < target){
			row ++;
		} else {
			col --;
		}
	}
	return new int[]{-1,-1};
}

    // static int[] searchInMatrix(int[][] matrix, int target){
    //     int row = 0;
    //     int col = matrix.length - 1;
    //     while (row < matrix.length && col >=0) {
    //         if (matrix[row][col] == target) {
    //             return new int[]{row, col};
    //         }
    //         if (matrix[row][col] < target) {
    //             row ++;
    //         } else{
    //             col --;
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

}
