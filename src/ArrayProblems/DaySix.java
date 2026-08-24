package ArrayProblems;

public class DaySix {
    // question 28 -> find maxSum subArray
    static int maxSumSubArray(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ;i++ ){
            //step1:
            sum = sum + arr[i];
            //step2:check for maxSum
            if(sum > maxSum){
                maxSum = sum;
            }
            //step3:check sum for negative value
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    //question 29 -> find maxSumSubArray -> agar hume maxSum ke sath vo max sum wala sub array bhi chahiye hoga toh ye krenge

    static int [] maxSumAndSubArray(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;
        for(int i = 0 ; i < n ;i++ ){
            //step1:
            sum = sum + arr[i];
            //step2:check for maxSum
            if(sum > maxSum){
                maxSum = sum;
                bestStart = start;
                bestEnd = i;
            }
            //step3:check sum for negative value
            if(sum < 0){
                sum = 0;
                start = i + 1;
            }
        }
        int [] result = new int[bestEnd - bestStart + 1];
        for(int i = bestStart; i <= bestEnd; i++){
            result[i - bestStart] = arr[i];
        }
        return result;
    }


    static void main() {
        // for q-28
        int [] arr = {-2, -1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxSumSubArray(arr);
        System.out.println(ans);
        System.out.println();

        //for q-29
        int [] arr2 = {-2, -1, -3, 4, -1, 2, 1, -5, 4};
        int [] ans2 = maxSumAndSubArray(arr2);
        for(int i: ans2){
            System.out.println(i);
        }
        System.out.println();
        int sum = 0;
        for(int i: ans2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
