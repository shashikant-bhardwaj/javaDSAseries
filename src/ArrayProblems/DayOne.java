package ArrayProblems;

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

    //question 4 -> find the maximum element in an array
    static int getMaximum(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //question 5 -> return sum of +ve and -ve numbers
    static int[] getPosNegSum(int[] arr){
        int posSum = 0;
        int negSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                //num is positive
                posSum += arr[i];
            }
            else{
                //num is negative
                negSum += arr[i];
            }
        }
        int [] ans = {posSum, negSum};
        return ans;


    }

    //question 6 -> calculate zeros and ones in an array
    static int[] countZeroAndOne(int[] arr){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }
            else{
                oneCount++;
            }
        }
        int ans[] = {zeroCount, oneCount};
        return ans;
    }

    //question 7 -> find first unsorted element
    static int getFirstUnsortedElement(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            if (arr[i + 1] < arr[i]) {
                return arr[i + 1];
            }
        }
        // vaise agar strictly bola hua hai ki array unsorted hai toh ye wala block kabhi bhi execute hi nhi hog
         return -1;
    }

    //question 8 -> swap alternate elements in an array
    static int[] swapAlternateElements(int arr[]){
        for(int i = 0; i < arr.length - 1; i+=2){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;

            arr[i] = arr[i]^arr[i+1];
            arr[i+1] = arr[i]^arr[i+1];
            arr[i] = arr[i]^arr[i+1];
        }
        return arr;
    }

    //question 9 -> print array intersection element
    static int[] arrayIntersectionElement(int[] arr1, int[] arr2){
        int size = arr1.length;
        int index = 0;
        int arr [] = new int[size];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                   arr[index] = arr1[i];
                   index++;
                }
            }
        }
        int [] result = new int[index];
        for(int i = 0; i < index; i++){
            result[i] = arr[i];
        }
        return result;
    }

    //question 10 => print alternate extreme element of an array
    static int[] getAlternateExtremeElement(int[]arr){
        int index = 0;
      int left = 0;
      int right = arr.length - 1;
      int [] result = new int [arr.length];
      while(left <= right){
          if(left == right){
              result[index] = arr[left];
              break;
          }else{
              result[index] = arr[left];
              result[index+1] = arr[right];
              left++;
              right--;
              index += 2;

          }

      }
      return result;

    }
    static void main() {
        // for q-1
//        int [] arr = {2, 4 ,3, 3};
//        System.out.println(getAverage(arr));
//
//        //for q-2
//        int [] arr2 = {5, 1, 2, 4, 2};
//        int [] ans = multiplyBy10(arr2);
//        System.out.println("printing ans array: ");
//        for(int i : ans){
//            System.out.println(i);
//        }
//
//        // for q-3
//        int [] arr3 = {5, 1, 2, 8, 12};
//        Boolean answer = findTarget(arr3, 88);
//        System.out.println(answer);
//
//        // for q-4
//        int [] arr4 = {9, 2, 5, 7, 12};
//        int max = getMaximum(arr4);
//        System.out.println(max);
//
//        // for q-5
//        int [] arr5 = {2, -1, 4, 6, -9};
//        int ans2[] = getPosNegSum(arr5);
//        System.out.println("positive number: " +ans2[0]);
//        System.out.println("negative Number: " +ans2[1]);
//
//        // for q-6
//        int [] arr6 = {0, 1, 1, 0, 1, 1, 1};
//        int [] ans3 = countZeroAndOne(arr6);
//        System.out.println("Number of zeros: " +ans3[0]);
//        System.out.println("Number of ones: " +ans3[1]);
//
//        // for q-7
//        int [] arr7 = {1, 2, 5, 4, 9};
//        int ans4 = getFirstUnsortedElement(arr7);
//        System.out.println(ans4);
//
//        // for q-8
//        int [] arr8 = {1, 2, 3, 4, 5};
//        int []ans5 = swapAlternateElements(arr8);
//        for(int i: ans5){
//            System.out.println(i);
//        }

        // for q-9
//        int [] arr9 = {1, 2, 3, 4, 5};
//        int [] arr10 = {2, 6, 7, 8};
//        int [] ans6 = arrayIntersectionElement(arr9, arr10);
//        for(int i: ans6){
//            System.out.println(i);
//        }

        // for q-10
        int [] arr11 = {1, 2, 3, 4, 5, 6};
        int [] ans7 = getAlternateExtremeElement(arr11);
        for(int i: ans7){
            System.out.println(i);
        }

    }
}
