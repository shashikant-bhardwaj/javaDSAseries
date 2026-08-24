package ArrayProblems;

public class DayThree {

    // question 17 -> sort of an array of 0s and 1s
    static int [] sortZerosAndOnes(int [] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if(arr[i] == 1 && arr[j] == 0) {
                //swap
                arr[i] = 0;
                arr[j] = 1;
            }else if(arr[i] == 0) {
                i++;
            }else if(arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    //question 18 -> find missing number in an array
    static int missingNumber(int arr[]){
        int XorSum = 0;
        //Xor with all array elements
        for(int i : arr){
            XorSum = XorSum ^ i;
        }
        //Xor with all elements in the range
        for(int i = 0 ; i <= arr.length ; i++){
            XorSum = XorSum ^ i;
        }
        return XorSum;
    }

    // qustion19 -> find unique element in an array (where other numbers appears twice)
    static int uniqueNumber(int [] arr){
        int XorSum = 0;
        for(int i : arr){
            XorSum = XorSum ^ i;
        }
        return XorSum;
    }


    static void main() {

        // for q-1
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] ans = sortZerosAndOnes(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();

        // for q-2
        int n = 6;
        int [] arr2 = {0, 2, 4, 1, 3, 5};
        int ans2 = missingNumber(arr2);
        System.out.println(ans2);
        System.out.println();

        // for q-3
        int [] arr3 = {1, 2, 2, 3, 3, 4, 5, 4, 5};
        int ans3 = uniqueNumber(arr3);
        System.out.println(ans3);


    }
}
