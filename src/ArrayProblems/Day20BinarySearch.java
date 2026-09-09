package ArrayProblems;

public class Day20BinarySearch {
    //Question -51 -> find element in nearly sorted array
    static int findElementInNearlySortedArray(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (mid-1 >= 0 && arr[mid-1] == target)
                return mid-1;
            if (arr[mid] == target)
                return mid;
            if (mid+1 < n && arr[mid+1] == target)
                return mid+1;

            if (target > arr[mid]){
                //move to right
                s = mid + 2;
            }
            else{
                //move to left
                e = mid - 2;
            }
        }
        return -1;
    }

    static void main() {
        //for q-51
        int[] arr = {10, 30, 20, 50, 40, 70, 60, 80};
        int target = 20;
        int index = findElementInNearlySortedArray(arr, target);
        System.out.println(index);
    }
}
