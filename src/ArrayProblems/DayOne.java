package ArrayProblems;

import java.sql.SQLOutput;

public class DayOne {
    // question 1 -> find average of all numbers in an array
    static double getAverage(int[] arr){
         double sum = 0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    // question 2  -> multiply each element of array by 10
    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i = 0; i < size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        //return newArray
        return newArray;


    }

    //question 3 -> search for an element in an array
    //linear search
    static Boolean findTarget(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    //question 3 -> find the maximum element in an array
    static int getMaximum(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void main() {
        // for q-1
        int [] arr = {2, 4 ,3, 3};
        System.out.println(getAverage(arr));

        //for q-2
        int [] arr2 = {5, 1, 2, 4, 2};
        int [] ans = multiplyBy10(arr2);
        System.out.println("printing ans array: ");
        for(int i : ans){
            System.out.println(i);
        }

        // for q-3
        int [] arr3 = {5, 1, 2, 8, 12};
        Boolean answer = findTarget(arr3, 88);
        System.out.println(answer);

        // for q-4
        int [] arr4 = {9, 2, 5, 7, 12};
        int max = getMaximum(arr4);
        System.out.println(max);
    }
}
