package ArrayProblems;

public class sortingAlgos {

    //Question 36 -> Bubble sort
    static int [] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    // Question 37-> Selection sort
    static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    // Question 38-> insertion sort
    static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int curr = i;
            int prev = i-1;
            int currValue = arr[curr];
            //shifting loop
            while(prev >= 0 && arr[prev] > currValue){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //ab humare pass ek khali jagah aa chuki hai
            //place the current value
            arr[prev+1] = currValue;
        }
        return arr;
    }


    static void main() {
        //for q-36
        int [] arr = {6, 5, 1, 3};
        int [] ans = bubbleSort(arr);
        System.out.println("printing the sorted array");
        for(int i: ans){
            System.out.println(i);
        }

        //for q-37
        int [] arr2 = {6, 5, 1, 3};
        int  [] ans2 = selectionSort(arr2);
        System.out.println("printing the sorted array");
        for( int i: ans2){
            System.out.println(i);
        }
        System.out.println();

        //for q-38
        int [] arr3 = {6, 5, 1, 3};
        int  [] ans3 = insertionSort(arr3);
        for( int i: ans3){
            System.out.println(i);
        }
    }
}
