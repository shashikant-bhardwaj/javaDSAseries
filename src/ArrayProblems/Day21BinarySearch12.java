package ArrayProblems;

public class Day21BinarySearch {
    //Question - 52 -> find single non-duplicate element using binary search
    static int singleNonDuplicate(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            //agar array mei ek hi element exist krta h
            if (start == end){
                return arr[start];
            }

            //non single element array
            //check whether mid element is a ans or not
            int currentValue = arr[mid];
            int prevValue = -1;
            if(mid - 1 >= 0){
                prevValue = arr[mid - 1];
            }
            int nextValue = -1;
            if(mid + 1 < n){
                nextValue = arr[mid + 1];
            }

            if(currentValue != prevValue && currentValue != nextValue){
                //iska mtlb current value hi valid answer hai
                return currentValue;
            }

            if(currentValue != prevValue && currentValue == nextValue){
                int startingIndexOfPair = mid;
                if((startingIndexOfPair & 1) == 1){
                    //startingIndex --> odd wala case
                    //ans left mei hoga
                    end = mid - 1;
                }
                else{
                    //startingIndex --> even wala case
                    //ans right mei h
                    start = mid + 1;
                }
            }
            else if(currentValue == prevValue && currentValue != nextValue){
                int endingIndexOfPair = mid;
                if((endingIndexOfPair & 1) == 1){
                    //ending index is odd
                    //ans right mei hoga
                    start = mid - 1;
                }
                else{
                    //ending index even hai
                    //aapka ans left mei hoga
                    end = mid - 1;
                }
            }


        }
        return -1;
    }

    static void main() {
        //for q-52
        int[] arr = {10, 10, 20, 20, 30, 30, 40, 40, 50, 60, 60};
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }
}
