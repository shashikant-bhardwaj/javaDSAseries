public class BasicsMaths {

    static void printDigits(int num){
        //agar mera num=0, toh mai ruk jaunga
        //agar mera num!=0 hai , toh mai processing krta raunga
        while(num!=0){
            int digit = num%10;
            System.out.println(digit);
            //last digit remove
            num = num/10;
        }}

    static int numberOfDigits(int num){
        //agar mera num=0, toh mai ruk jaunga
        //agar mera num!=0 hai , toh mai processing krta raunga
        int count = 0;
        while(num!=0){
            int digit = num%10;
            count++;
            //last digit remove
            num = num/10;
        }
           return count;
    }

    static int sumOfDigits(int num){
        //agar mera num=0, toh mai ruk jaunga
        //agar mera num!=0 hai , toh mai processing krta raunga
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum += digit;
            //last digit remove
            num = num/10;
        }
        return sum;
    }

    static int reverse(int num){
        int reverse = 0;
        while(num!=0){

            int digit = num%10;
            reverse = reverse * 10 + digit;

            //last digit remove
            num = num/10;
        }
        return reverse;
    }

    static boolean ispalindrome(int num){
        int original = num;
        int reverse = reverse(num);
        if(original==reverse){
            System.out.println("palindrome");
            return true;
        }else{
            System.out.println("not palindrome");
            return false;
        }
    }

    static boolean isPrimeOrNot(int num){
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                return false;
        }
//        for(int i=2;i< num-1;i++){
//            if(num%i==0){
//                return false;
//            }

        }
        // yaha tabhi pahuch paoge jab loop se bahar nikloge
        //aur loop se tabhi bahar nikloge jab remainder kabhi zero nhi aayega
        //iska mtlb its a prime number

        return true;
    }

    static int getGCD(int a,int b){
        //gcd(a,b) = gcd(b,a%b)

        while(b!=0){
            int oldValOfb = b;
            b = a % b;
            a = oldValOfb;
        }
        // jab mera b zero hoga , tab a ki place pr gcd milega
        int ans = a;
        return ans;
    }

    static int getLCM(int a,int b){
        int gcd =  getGCD(a,b);
        int prod = a*b;
        int lcm = prod/gcd;
        return lcm;
    }

    static boolean isArmstrong(int num){
        int sum = 0;
        int originalNum = num;
        while(num!=0){
            int digit = num%10;
            int cubeOfDigit = digit*digit*digit;
            sum +=cubeOfDigit;
            //last digit remove
            num = num/10;
        }
        if(originalNum==sum){
            return true;
        }else{
            return false;
        }

    }

    static boolean checkPerfectNumber(int num){
        int sum = 1;
        for (int i = 2; i*i <= num; i++) {
            if(num%i == 0){
                //i ne num ko perfectly divide kr diya h
                //toh ab factor pair kya bnega
                //1st facot --> i
                //2nd facor --> num/i
                int firstFactor = i;
                int secondFactor = num/i;
                sum += firstFactor + secondFactor;
            }

        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }


    static void main() {
//        // print digits of a number
//        int num = 53127;
//        printDigits(num);
//
//
//        // print number of digits in a number
//        int numberOfDigits = numberOfDigits(num);
//        System.out.println(numberOfDigits);
//
//        // sum of  a digits
//        int sum = sumOfDigits(num);
//        System.out.println(sum);

//         int num = 1234;
//         int reverseNumber = reverse(num);
//        System.out.println(reverseNumber);
//
//        // number is palindrome or not
//        boolean ans = ispalindrome(num);
//        System.out.println(ans);

        // prime number or not
//        int num = 11;
//        boolean ans = isPrimeOrNot(num);
//        System.out.println(ans);

        // get gcd
//        int ans = getGCD(18,12);
//        System.out.println(ans);

        //get LCM
//        int ans = getLCM(18,12);
//        System.out.println(ans);

        // Armstrong or not
//        int num =155;
//        boolean ans = isArmstrong(num);
//        System.out.println(ans);

        //perfectNumber or not
        boolean ans = checkPerfectNumber(8);
        System.out.println(ans);
    }
}
