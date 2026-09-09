package ArrayProblems;

public class Day19BinarySearch {
    //Question 50 -> roti parata problem

    //predicate function
    static Boolean isValidAnswer(int totalParata, int [] cook, int totalCooks, int timeLimit){
        int parataCount = 0;
        //ek ek karke har cook ke pass jayenge
        for(int i = 0; i<cook.length; i++){
            int currentCookRank = cook[i];
            int timeTaken = 0;
            int j = 1;

            //agar currentCookRank --> R
            // parante aise bnenge --> 1*R, 2*R, 3*R, ---
            //cook krna start krvao
            while(timeTaken <= timeLimit){
                if(timeTaken + j*currentCookRank <= timeLimit){
                    timeTaken += j*currentCookRank;
                    //iska mtlb mai ye parata bna sakta hu
                    parataCount++;
                    j++;
                }
                else{
                    //iska mtlb current parata time limit ke andr nhi bn sakta
                    break;
                }
            }
            //jab ye loop khtm hota h toh ye ith cook jitne parate bna sakta tha
            //unka total parata count mei add kr chuka hota hai

            if(parataCount >= totalParata){
                return true;
            }
        }
        if(parataCount >= totalParata){
            return true;
        }
        else{
            return false;
        }

    }
    static int minTimeCookParata(int p, int[] cook, int n){
        //p -> number of parata to cook
        //n -> number of cooks

        int maxRank = -1;
        for(int i = 0; i < cook.length; i++){
            if(cook[i] > maxRank){
                maxRank = cook[i];
            }
        }

        int start = 0;
        //R*(n*(n+1)/2) -> R = maxRank, n -> number of paratas
        int end = maxRank * (p*(p+1)/2);
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isValidAnswer(p, cook, n, mid)){
                //ans store
                ans = mid;
                //move to left
                end = mid - 1;
            }
            else{
                //move to right
                start = mid + 1;
            }
        }
        return ans;
    }

    static void main() {
        //for q-50

        int [] cook = {1, 2, 3, 4};
        int p = 10;
        int n = 4;
        int minTime =  minTimeCookParata(p, cook, n);
        System.out.println(minTime);
    }
}
