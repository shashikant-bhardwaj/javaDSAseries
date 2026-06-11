public class Methods {
    static void print2kaTable(){
        for(int i = 1; i <= 10; i++){
            int ans = 2*i;
            System.out.println("-->" + ans);
        }
    }
     static void  printSum(int x , int y){
        System.out.println("Sum:" + (x+y));
    }
    static void printMultiplication(int x , int y){
        System.out.println("Multiplication:" + (x*y));
        return;
    }
    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    static int add(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    static void solve(int num){         //ye call by value hai jismei copy pass ki jati h data ki
        System.out.println(num);
        num = num*10;
        System.out.println(num);
    }

    static void main() {
        int num = 5;
        System.out.println(num);
        solve(num);
        System.out.println(num);
//          int Result1 = add(1,2);
//          int Result2 = add(1,2,3);
//        System.out.println("Result1:"+Result1);
//        System.out.println("Result2:"+Result2);

//        printMultiplication(5,3);
//        System.out.println("hey");
//        print2kaTable();
//        System.out.println("bye");
//        printSum(5 , 10);

    }
}