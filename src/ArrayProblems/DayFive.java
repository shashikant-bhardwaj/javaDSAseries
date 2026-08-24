package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class DayFive {

    //question 27 -> find missing elements from an array with duplicates
    static List<Integer> missingElements(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        //marking
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            int value = Math.abs(arr[index]);
            int position = value - 1;
            //mark krdo ye position
            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }
        //travel array and whenever you encounter a positive value , print the number at the same time
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }


    static void main() {
        //for q-27
        int [] arr = {1, 4, 4, 5, 2, 2};
        List<Integer> ans = missingElements(arr);
        for(int i: ans){
            System.out.println(i);
        }
    }
}
