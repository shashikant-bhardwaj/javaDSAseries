package ArrayProblems;

import java.util.*;

public class DayFour {
    //question 21 -> Two sum
    static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    //question 22 -> Three sum
    static List<List<Integer>> threeSum(int[] arr, int target){
        Set<List<Integer>> output = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                       output.add(temp);

                    }
                }
            }
        }
        return new ArrayList<>(output);
    }

    //question 23-> remove duplicates from sorted array
    static int removeDuplicates(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 1;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        return i + 1;
    }

    //question 24 -> find first repeating element in array(left -> right traverse)
    static int firstRepeatingElement(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int i=0;i<n;i++){
            if(map.get(arr[i]) > 1){
                return arr[i];
            }
        }
        return -1;
    }

    //question 25 -> find element whose occurence repeat first (vo element jiski occurence sabse pehle repeat hoti ho)
    static int firstRepeatOccurence(int[] arr){
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                return arr[i];
            }else{
                set.add(arr[i]);
            }
        }
        return -1;
    }

    //question 26 -> find the pivot index
     static int findPivotElement(int[] arr){
        int n = arr.length;
        int []leftSum = new int[n];
        int []rightSum = new int[n];

        //fill  left sum wala array
         leftSum[0] = arr[0];
         for (int i = 1; i < n; i++) {
             leftSum[i] = leftSum[i-1] + arr[i];
         }

         //fill right sum wala array
         rightSum[n-1] = arr[n-1];
         for (int i = n-2; i >= 0; i--) {
             rightSum[i] = rightSum[i+1] + arr[i];
         }

         for(int i=0;i<n;i++){
             if(leftSum[i]==rightSum[i]){
                 return i;
             }
         }
         return -1;
     }


    static void main() {

        // for q-21
        int []arr = {4, 5, 6, 1, 3};
        int target = 10;
        int []ans = twoSum(arr, target);
        for(int i: ans){
            System.out.println(i);
        }
        System.out.println();

        // for q-22
        int [] arr2 = {4, 5, 6, 1, 3, 7, 0};
        int target2 = 11;
        List<List<Integer>> ans2 = threeSum(arr2, target2);
        for(List<Integer> i: ans2){
            System.out.println(i);
        }
        System.out.println();

        //for q-23
        int [] arr3 = {1, 2, 2, 2, 2, 3, 3, 4};
        int ans3 = removeDuplicates(arr3);
        System.out.println(ans3);
        System.out.println();

        // for q-24
        int [] arr4 = {10, 5, 3, 4, 3, 5, 6};
        int ans4 = firstRepeatingElement(arr4);
        System.out.println(ans4);
        System.out.println();

        //for q-25
        int [] arr5 = {10, 5, 3, 4, 3, 5, 6};
        int ans5 = firstRepeatOccurence(arr5);
        System.out.println(ans5);
        System.out.println();

        //for q-26
        int [] arr6 = {1, 7, 3, 6, 5, 6};
        int ans6 = findPivotElement(arr6);
        System.out.println(ans6);


    }
}
