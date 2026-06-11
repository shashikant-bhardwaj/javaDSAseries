import java.util.Scanner;

public class Arrays {
    static void main() {

//        int arr[] = {11, 12, 13};
//        int n = arr.length;
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println(arr[i]);
//        }

//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//
//        //input
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println("provide input for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //print
//        System.out.println("your array contains ");
//        for(int val: arr){
//            System.out.println(val);
//
//        }


        //declaration
//        int arr[];

        //allocation
//        arr = new int[5];

        //initialization
//        int brr[] = {10, 20, 30};
//
//        for(int val: brr) {
//            System.out.println(val);
//        }
//        int n = brr.length;
//        for(int index = 0; index <= n-1; index++){
//            System.out.println("value at index " + index + ": " + brr[index]);
//        }

//        System.out.println("value at 0 index: " + brr[0]);
//        System.out.println("value at 1 index: " + brr[1]);
//        System.out.println("value at 2 index: " + brr[2]);

        // practice question 1
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println("provide elements for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //print sum of all elements in array
//        int sum = 0;
//        for (int i = 0; i <= n-1; i++) {
//            sum += arr[i];
//
//        }
//        System.out.println("sum is " + sum);

        // practice question 2
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println("provide elements for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //print sum of all elements in array
//        int product = 1;
//        for (int i = 0; i <= n-1; i++) {
//            product *= arr[i];
//
//        }
//        System.out.println("Product is " + product);

        //Practice question 3
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println("provide elements for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //comparing the value for maxValue
//        int maxValue = arr[0];
//        for (int i = 1; i <= n-1; i++) {
//            if (arr[i] > maxValue) {
//                maxValue = arr[i];
//            }
//        }
//        System.out.println("max value is " + maxValue);

        //Practice question 4
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println("provide elements for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //comparing the value for minValue
//        int minValue = arr[0];
//        for (int i = 1; i <= n-1; i++) {
//            if (arr[i] < minValue) {
//                minValue = arr[i];
//            }
//        }
//        System.out.println("min value is " + minValue);


        // 2D Array

        //declaration
//        int[][]arr;

        //allocation
//        arr = new int[3][4];

        //initialization
//        int[][]brr = {
//                       {1,2},
//                       {2,3,4,5},
//                       {3,4,4,5,6,7},
//                       {4,5}
//                   };
//        System.out.println(brr[3][1]);
//        int rowLength = brr.length;
//        int colLength = brr[0].length;
//        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
//            //jaise hi mai kisi new  row mei aaya
//            //same point mei maine uss row ka colLength find out kr liya
//            //current row --> brr[rowLength]
//            //ismei kitna column --> brr[rowIndex].length
//
//            int colLength = brr[rowIndex].length;
//            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + "  ");
//            }
//            System.out.println();
//        }


        //how to take input in 2D array
//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        int rowIndex;
//        for (rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//                System.out.println("provide value for row" + rowIndex + " and col" + colIndex);
//                arr[rowIndex][colIndex] = sc.nextInt();
//            }
//
//        }
//
//
//        //output
//        System.out.println("your array contains following elements");
//        for (rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//                System.out.print(arr[rowIndex][colIndex] + "  ");
//            }
//            System.out.println();
//        }


        // Practice question
//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        int rowIndex;
//        for (rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//                System.out.println("provide value for row" + rowIndex + " and col" + colIndex);
//                arr[rowIndex][colIndex] = sc.nextInt();
//            }
//
//        }
//
//
//        //output
//        int sum = 0;
//        for (rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//              sum += arr[rowIndex][colIndex];
//            }
//
//        }
//        System.out.println("sum is: " + sum);

        // practice question
//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        int rowIndex;
//        for (rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//                System.out.println("provide value for row" + rowIndex + " and col" + colIndex);
//                arr[rowIndex][colIndex] = sc.nextInt();
//            }
//
//        }
//
//
//        //output
//        int product = 1;
//        for (rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//                product *= arr[rowIndex][colIndex];
//            }
//
//        }
//        System.out.println("product is: " + product);


        //practice question
//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        for (int  rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//                System.out.println("provide value for row" + rowIndex + " and col" + colIndex);
//                arr[rowIndex][colIndex] = sc.nextInt();
//            }
//
//        }
//
//
//        //output
//        int maxValue = arr[0][0];
//        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//                if(arr[rowIndex][colIndex] > maxValue) {
//                    maxValue = arr[rowIndex][colIndex];
//                }
//            }
//
//        }
//        System.out.println("max value is " + maxValue);

        //practice question
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int  rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
                System.out.println("provide value for row" + rowIndex + " and col" + colIndex);
                arr[rowIndex][colIndex] = sc.nextInt();
            }

        }


        //output
        int minValue = arr[0][0];
        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
                if(arr[rowIndex][colIndex] < minValue) {
                    minValue = arr[rowIndex][colIndex];
                }
            }

        }
        System.out.println("min value is " + minValue);


    }
}
