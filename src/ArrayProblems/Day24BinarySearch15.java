//package ArrayProblems;
//
//public class Day24BinarySearch15 {
//    //Question-56 -> Unbounded search
//    static int unboundedSearch(InfiniteArray arr, int target) {
//        if(arr.get(0) == target){
//            return 0;
//        }
//        int i = 1;
//        while(arr.get(i) <= target){
//            i = i*2;
//        }
//        if(arr.get(i) > target){
//            int s = i/2;
//            int e = i;
//            //normal binary search use krlo ab
//            while(s <= e){
//                int mid = s + (e-s)/2;
//                if(arr.get(mid) == target){
//                    return mid;
//                }
//                if(arr.get(mid) > target){
//                    e = mid-1;
//                }
//                else{
//                    //value target se chhoti hai
//                    //move to right
//                    s = mid+1;
//                }
//            }
//
//        }
//        else{
//            return -1;
//        }
//        return -1;
//    }
//}
