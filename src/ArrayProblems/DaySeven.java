package ArrayProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.ListResourceBundle;

public class DaySeven {

    // 2-D array problems starting

    //question30 -> print the sum of each row in a 2d Array
    static List<Integer> sumOfEachRow(int[][] arr){
        List<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int row=0;row<m;row++){
            //jaise hi mai new row mei aaunga
            //waise hi mai sum=0 kr dunga
            int sum = 0;
            for(int col=0;col<n;col++){
                int value = arr[row][col];
                sum = sum + value;
            }
            //jab mai sare column ki values traverse and add kr
            //chuka hounga, tab mere pass sum wale variable mei entire
            //row ka sum ready hoga
            list.add(sum);
        }
        return list;

        }

        //question 31-> print the sum of each col in a 2d Array
    static List<Integer> sumOfEachColumn(int[][] arr){
        List<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int col=0;col<m;col++){
            //jaise hi mai new col pe aaunga
            //waise hi mai sum=0 kr dunga
            int sum = 0;
            for(int row=0;row<n;row++){
                int value = arr[row][col];
                sum = sum + value;
            }
            list.add(sum);
        }
        return list;
    }

    //Question 32-> wave print a Matrix
    static List<Integer> wavePrint(int[][] arr){
        List<Integer> list = new ArrayList<>();
        //lets move column wise
        int m = arr.length;
        int n = arr[0].length;
        for(int col=0;col<n;col++){
            //har ek col index ko check kro for odd/even

            if((col & 1) == 1){
                //odd
                for(int row=m-1;row>=0;row--){
                    list.add(arr[row][col]);
                }
            }else{
                //even
                //top to bottom
                for(int row=0;row < m;row++){
                    list.add(arr[row][col]);
                }
            }
        }
        return list;
    }

    //Question 33 -> Transpose of an array
    static int [][] transpose(int[][] arr){
        //for original array
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        //for new araray
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;
        //new array
        int [][] ans =  new int[newTotalRows][newTotalCols];
        for(int i=0;i<totalRows;i++){
            for(int j=0;j<totalCols;j++){
                ans[j][i]= arr[i][j];
            }
        }
        return ans;

    }


    static void main() {
        // forq-30
        int [][]arr = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = sumOfEachRow(arr);
        for(int i: list){
            System.out.println(i);
        }
        System.out.println();

        //for q-31
        int [][] arr2 = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list2 = sumOfEachColumn(arr2);
        for(int i: list2){
            System.out.println(i);
        }
        System.out.println();

        //for q-32
        int [][] arr3 = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list3= wavePrint(arr3);
        for(int i: list3){
            System.out.println(i);
        }
        System.out.println();

        //for q-33
        int [][] arr4 = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] ans =  transpose(arr4);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.println(ans[i][j]);

            }
        }
    }
    }
