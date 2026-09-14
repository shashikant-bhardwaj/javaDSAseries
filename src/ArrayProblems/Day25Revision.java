package ArrayProblems;

import java.util.HashMap;

public class Day25Revision {
    //Q1
//    static double avg(int[] arr){
//        int n = arr.length;
//        double sum = 0;
//        for(int i=0; i<n; i++){
//            sum += arr[i];
//        }
//        double avg = sum/n;
//
//        System.out.println(avg);
//        return -1;
//    }

    //Q2
//    static void multiplyby10(int[]arr){
//        int n = arr.length;
//        int [] result = new int[n];
//        for(int i=0;i<n;i++){
//
//            result[i] = arr[i]*10;
//        }
//        for(int i: result){
//            System.out.println(i);
//        }
//    }


    //Q3
//    static void searchTargetValue(int[] arr, int target){
//        int n = arr.length;
//        for(int i=0; i<n; i++){
//            if(arr[i]==target){
//                System.out.println("target exist  at index :" +i);
//                System.out.println(arr[i]);
//            }
//
//        }
//        System.out.println("target doesnt exist");
//    }

    //Q4 find  minimum element in an array
//    static void minElement(int[] arr){
//        int n = arr.length;
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<n; i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println("Minimum element is "+min);
//    }


    //Q5 -> find the max element in an array
//    static void maxElement(int[] arr){
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<n; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("Maximum element is "+max);
//    }


    //Q6 -> find the sum of positive and negative number
//    static void sumOfPosAndNeg(int[] arr){
//        int n = arr.length;
//        int sumOfPos=0;
//        int sumOfNeg=0;
//        for(int i=0; i<n; i++){
//            if(arr[i]<0){
//                sumOfNeg+=arr[i];
//            }
//            else{
//                sumOfPos+=arr[i];
//            }
//        }
//        System.out.println("sum of pos numbers "+ sumOfPos);
//        System.out.println("sum of neg numbers "+ sumOfNeg);
//    }

    //Q7 -> count number of zeros and ones
//    static void countZeroAndOne(int[] arr){
//        int n=arr.length;
//        int countZero=0;
//        int countOne=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                countZero++;
//            }
//            else{
//                countOne++;
//            }
//        }
//        System.out.println("Number of zero :  "+countZero);
//        System.out.println("Number of one :  "+countOne);
//    }


    //Q8
//    static void firstUnsortedElement(int[]arr){
//        int n = arr.length;
//        for(int i=0; i<n-1; i++){
//            if(arr[i+1] <= arr[i]){
//                System.out.println(arr[i+1]);
//            }
//        }
//
//    }

    //Q9
//    static void swapAlternateEle(int[]arr){
//        int n = arr.length;
//        for(int i=0; i<n-1; i+=2){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//
//        }
//        for(int i: arr){
//            System.out.print(i+" ");
//        }
//    }

    //Q10
//    static void intersection(int[] arr1, int[] arr2){
//        int n = arr1.length;
//        int m = arr2.length;
//        int [] arr = new int[n];
//        int index = 0;
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                if(arr1[i] == arr2[j]){
//                    arr[index] = arr1[i];
//                    index++;
//                }
//            }
//
//
//        }
//        int result [] = new int[index];
//        for(int i = 0; i < index; i++){
//            result[i] = arr[i];
//        }
//        for(int i: result){
//            System.out.print(i+" ");
//        }
//    }

    //Q11 -> printing alternate extreme element of anarray
//    static void pritAltExtElement(int[] arr){
//        int n =  arr.length;
//        int i = 0;
//        int j = n-1;
//        int index = 0;
//        int [] newArr = new int[n];
//        while(i<=j){
//            if(i==j){
//                newArr[index]=arr[i];
//                break;
//            }
//            else{
//                newArr[index]=arr[i];
//                newArr[index+1]=arr[j];
//                i++;
//                j--;
//                index+=2;
//            }
//        }
//        for(int num: newArr){
//            System.out.print(num+ " ");
//        }
//    }



    //Q12 -> reverse an array
//    static void reverse(int[] arr){
//        int n = arr.length;
//        int i = 0;
//        int j = n - 1;
//        while (i <= j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//        for(int num : arr){
//            System.out.print(num+ " ");
//        }
//    }


    //Q13 -> shift element by 1 position
//    static void shiftbyone(int [] arr){
//        int n = arr.length;
//        int i = n-1;
//        int temp = arr[i];
//        while(i>0){
//            arr[i] = arr[i-1];
//
//            i--;
//        }
//        arr[i] = temp;
//
//        for(int num: arr){
//            System.out.println(num+ " ");
//        }
//
//    }

    //Q14-> shift element by k position
//    static void shiftByk(int [] arr, int k){
//      int n = arr.length;
//      int index = 0;
//      int limit = arr.length-k;
//      int[] temp = new int[k];
//
//      //store last k element in temp
//        for(int i = n-1; i >= limit ; i--){
//            temp[index] = arr[i];
//
//            index++;
//        }
//
//        //now shift element in arr by k position
//        for(int i = n-1; i >= k ; i--){
//            arr[i] = arr[i-k];
//        }
//
//        // agar yaha pahuch gye toh iska mtlb hai element shift ho chuke hai
//        //ab jo last 2 element temp mei store hai
//        //usse arr ke suru mei store krenge
//
//        for(int i = 0; i < index; i++){
//            arr[i] = temp[i];
//        }
//
//        // ab sare element shift ho chuke hai
//
//        for(int num: arr){
//            System.out.println(num+ " ");
//        }
//    }


//    Q15 -> find the mode of the array
//    static void highestFreqKey(int [] arr){
//        int n = arr.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        //store arr values in hashmap in key value pairs
//        for(int num: arr){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        int maxFreq = Integer.MIN_VALUE;
//        int maxFreqKey = Integer.MIN_VALUE;
//        for(int key: map.keySet()){
//            int currentKey = key;
//            if(map.get(key) > maxFreq){
//                maxFreq = map.get(key);
//                maxFreqKey = currentKey;
//            }
//        }
//        System.out.println("max frequecy key is : " +maxFreqKey);
//        System.out.println("And the frequency is : " +maxFreq);
//    }


    //Q16 -> find element with highest and lowest frequency
//    static void highAndLowFreqKey(int [] arr){
//        int n = arr.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        //store arr values in hashmap in key value pairs
//        for(int num: arr){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        // calculating high freq key
//        int maxFreq = Integer.MIN_VALUE;
//        int maxFreqKey = Integer.MIN_VALUE;
//        for(int key: map.keySet()){
//            int highFreqCurrentKey = key;
//            if(map.get(key) > maxFreq){
//                maxFreq = map.get(key);
//                maxFreqKey = highFreqCurrentKey;
//            }
//        }
//
//        //calculating low freq key
//        int minFreq = Integer.MAX_VALUE;
//        int minFreqKey = Integer.MAX_VALUE;
//        for(int key: map.keySet()){
//            int lowFreqCurrentKey = key;
//            if(map.get(key) < minFreq){
//                minFreq = map.get(key);
//                minFreqKey = lowFreqCurrentKey;
//            }
//        }
//        System.out.println("max frequecy key is : " +maxFreqKey);
//        System.out.println("And the frequency is : " +maxFreq);
//        System.out.println();
//        System.out.println("min frequecy key is : " +minFreqKey);
//        System.out.println("And the frequency is : " +minFreq);
//    }

    //Q17 -> sort 0 and 1 in array
//    static void sort0And1(int[] arr){
//        int n = arr.length;
//        int i = 0;
//        int j = n-1;
//        while(i<j){
//          if(arr[i]==1 && arr[j]==0){
//              int temp = arr[i];
//              arr[i] = arr[j];
//              arr[j] = temp;
//          }
//          if(arr[i]==0){
//              i++;
//          }
//          if(arr[j]==1){
//              j--;
//          }
//        }
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//    }


    //Q18 -> find the missing number in an array
//    static void missingNumber(int[] arr){
//        int XORsum = 0;
//
//        //xor  with all elements of array
//        for(int num: arr){
//            XORsum = XORsum^num;
//        }
//        //xor with range
//        for(int i = 0; i <= arr.length; i++){
//            XORsum = XORsum^i;
//        }
//
//        System.out.println("missing number is : " + XORsum);
//    }


    //Q19 -> find maxsum of subarray -> KADEN'S ALGORITHIM
    static void maxSumOfSubArray(int[] arr){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 0; i < arr.length; i++){
            //step1.
            sum += arr[i];

            //step2.
            if(maxSum < sum){
                maxSum = sum;
                bestStart = start;
                bestEnd = i;
            }
            if (sum < 0){
                sum = 0;
                start = i+1;
            }
        }
        System.out.println("the maxSum subarray is : ");
        for(int i = bestStart; i <= bestEnd; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("and the max sum is : "+maxSum);
    }
    static void main() {
       int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        maxSumOfSubArray(arr);


    }



}
