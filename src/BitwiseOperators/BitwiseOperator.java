package BitwiseOperators;

public class BitwiseOperator {
    static void main() {
//        int a = 5;
//        int b = 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~a);

        //Bitwise left shift
//        int n = 5;
//        for(int i = 1; i <=32 ; i ++){
//            n = n << 1;
//            System.out.println(n);
//        }

        //Bitwise Right shift
//        int n = 100;
//        for(int i = 1; i<=10; i++){
//           n = n >> 1;
//            System.out.println(n);
//        }

        // to check whether a number is even or odd

        //method 1 -> % METHOD
//        int n = 11;
//        if( n%2 == 0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }

        // method 2 -> bitoperator METHOD
//        int n = 11;
//        if( (n&1) == 0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }

        // now we use bitwise operators to make calculation process fast

        // Example - check power of 2
//        int n = 5;
//        int count = 0;
//        while (n!=0){
//            if((n&1) != 0){
//                //mujhe ek set bit milgyi
//                count++;
//            }
//            //ab right shift krenge
//            n = n >> 1;
//        }
//        System.out.println("set bit count: " + count);

        // shortcut of above method
//        int n = 32;
//        if( (n&(n-1)) == 0){
//            System.out.println("it's a  power of 2 number");
//        }else{
//            System.out.println("not a power of 2 number");
//        }


//        System.out.println(3<<2);
        //3*2*2

//        System.out.println(16>>2);
        //3/(2*2)

        // Example - remove last set bit
//        int n = 5;
//        int removedLastSetBit = n&(n-1);
//        System.out.println(removedLastSetBit);

        //Example - find last setbit
        int n = 5;
        int lastSetBit = n & -(n);

        System.out.println(lastSetBit);

    }
}
