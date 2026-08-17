package ArrayProblems;

import java.util.HashMap;

public class DayTwo {

    // question 11 -> swap alternate
    static int[] reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            arr[i] = arr[i]^arr[j];
            arr[j] = arr[i]^arr[j];
            arr[i] = arr[i]^arr[j];
            i++;
            j--;
        }
        return arr;
    }

    // question 12 -> shift element by one position
    static int[] shiftElementByOnePosition(int[] arr){
       int temp = arr[arr.length-1];
       for(int i=arr.length-1;i>0;i--){
           arr[i] = arr[i-1];
       }
       arr[0] = temp;
       return arr;
    }

    //question 13 -> find mode of an array
    static int getMode(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        //insert values of array in hashmap
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

//        for(int key: map.keySet()){
//            System.out.println( key+ "-> " +map.get(key));
//        }

        // print highest frequeny key and its frequency also
        int maxFreq = 0;
        int maxFreqKey = 0;
        for(int key: map.keySet()){
            int currentKey = key;
            int currentKeyFreq = map.get(key);
            if(currentKeyFreq > maxFreq){
                //naya max mil gya
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }

    // question 14 -> find identify element with highest and lowest frequency
    static int[] getHighAndLowFreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int maxFreqKey = 0;
        for(int key: map.keySet()){
            int currentKey = key;
            int currentKeyFreq = map.get(key);
            if(currentKeyFreq > maxFreq){
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }
        int minFreq = Integer.MAX_VALUE;
        int minFreqKey = 0;
        for(int key: map.keySet()){
            int currentKey = key;
            int currentKeyFreq = map.get(key);
            if(currentKeyFreq < minFreq){
                minFreq = currentKeyFreq;
                minFreqKey = currentKey;
            }
        }
        int ans [] = {maxFreqKey, minFreqKey};
        return ans;



    }

    //question 15 -> shift element by k position
    static int[] shiftElementByPositionK(int[] arr,int k){
        int [] temp = new int[k];
        int limit = arr.length - k;
        int index = 0;
        for(int i = arr.length-1;i>=limit;i--){
            temp[index] = arr[i];
            index++;
        }
        for(int i = arr.length-1;i>=k;i--){
            arr[i] = arr[i-k];
        }
        for(int i = 0; i < k; i++){
            arr[i] = temp[i];

        }
        return arr;
    }

    // question 16 -> find union of two array
    static int[] unionOfArrays(int[] arr1, int[] arr2){
     int [] result = new int[arr1.length+arr2.length];
     int index = 0;
     //pehle 1st array ke element result mei store krenge
     for(int i=0;i<arr1.length;i++){
         result[index]=arr1[i];
         index++;
     }


     //ab second array ke element  result mei store krenge with condition
        for(int i=0;i<arr2.length;i++){

            boolean found = false;

            for(int j = 0; j < index; j++){

                if(result[j] == arr2[i]){
                    found = true;
                    break;
                }
            }

            if(!found){
                result[index] = arr2[i];
                index++;
            }
        }
        int [] ans = new int[index];
        for(int i = 0; i < index; i++){
            ans[i] = result[i];
        }

        return ans;



    }


    static void main() {


        // for q-11
        int arr[] = {1, 2, 3, 4, 5, 6};
        int ans [] = reverseArray(arr);
        for(int i: arr){
            System.out.println(i);
        }
        System.out.println();


        // for q-12
        int arr2 [] = {1, 2, 3, 4, 5, 6};
        int ans2[] = shiftElementByOnePosition(arr2);
        for (int i: arr2) {
            System.out.println(i);
        }
        System.out.println();

        // for q-13
        int [] arr3 = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int ans3 = getMode(arr3);
        System.out.println(ans3);

        // for q-14
        int []arr4 = {1, 1, 1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6};
        int[] ans4 = getHighAndLowFreq(arr4);
        System.out.println("Highest frequency number: " + ans4[0]);
        System.out.println("Lowest frequency number: " + ans4[1]);

        // for q-15
        int [] arr5 = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int []ans5 = shiftElementByPositionK(arr5, k);
        for (int i: ans5) {
            System.out.println(i);
        }
        System.out.println();

        // for q-16
        int [] arr6 = {1, 2, 3, 4};
        int [] arr7 = {4, 5, 6, 7, 8};
        int [] ans6 = unionOfArrays(arr6, arr7);
        for(int i: ans6){
            System.out.println(i);
        }
    }
}
