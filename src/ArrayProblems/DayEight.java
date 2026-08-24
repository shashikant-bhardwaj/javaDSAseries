package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class DayEight {

    //question 34 -> Rotate image or Rotate a 2d array by 90 degree
    static int[][] rotate90Degree(int[][] matrix, int N){
        //step1:- tranpose krenge original array ka
            //swap matrix[i][j], matrix[j][i]
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                //seap matrix[i][j] , matrix[j[i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //step:-2 reverse all rows
            //harr row par jaunga and usse reverse kr dunga

      for (int row = 0; row < N; row++){
          // ab mai  ek new row pe  aa chuka hu
          // ab reverse start kar do
          int startCol = 0;
          int endCol = N - 1;
         while (startCol <= endCol){
             int temp = matrix[row][startCol];
         matrix[row][startCol] = matrix[row][endCol];
         matrix[row][endCol] = temp;
         startCol++;

         endCol--;}
      }
      return matrix;

    }

    // Question 35 -> spiral print a matrix
    static List<Integer> sprialOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int statingRow = 0;
        int endingRow = m - 1;
        int statingCol = 0;
        int endingCol = n - 1;

        while (statingRow <= endingRow && statingCol <= endingCol) {
            //row wise - left to right , from startingCol to endingCol
            for (int col = statingCol; col <= endingCol; col++) {
                list.add(matrix[statingRow][col]);
            }
            statingRow++;
            //col wise - top to bottom , from startingRow to endingRow
            for (int row = statingRow; row <= endingRow; row++) {
                list.add(matrix[row][endingCol]);
            }
            endingCol--;
            //row wise - right to left , from endingCol to startingCol
            if(statingRow <= endingRow){
            for (int col = endingCol; col >= statingCol; col--) {
                list.add(matrix[endingRow][col]);
            }
            endingRow--;
            }
            //col wise - bottom to top , from endingRow to statingRow
            if(statingCol <= statingRow){
            for (int row = endingRow; row >= statingRow; row--) {
                list.add(matrix[row][statingCol]);
            }
            statingCol++;
            }

        }
        return list;
    }


    static void main() {
        // for q-34
        int [][]matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int N = matrix.length;
        int [][] ans = rotate90Degree(matrix, N);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");

            }
        }
        System.out.println();

        //q-35
        int [][] matrix2 = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30}, {31, 32, 33, 34, 35, 36}};
        List<Integer> list = sprialOrder(matrix2);
        for(int i: list){
            System.out.print(i + "  ");
        }
    }

}
