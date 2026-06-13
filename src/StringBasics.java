import java.util.Scanner;

public class StringBasics {

    static void printstring(String str){
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthOfString(String str){
        int count = 0;
        int n = str.length();
        for(int i=0;i<n ;i++){
            count++;
        }
        return count;
    }

    static int countVowel(String str){
        int count = 0;
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch== 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch== 'U'){
                count++;
            }
        }
        return count;
    }

    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse += ch;
        }
        return reverse;
    }

    static Boolean isPalindrome(String str){
        String original = str;
        int n = str.length();
        String reverse = reverseString(original);
        if(original.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }



    static void main() {
//        String firstName = "Shashikant";
//        String lastName = new String("Bhardwaj");
//        System.out.println(firstName + " " + lastName);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(0));
//
//        String name = "shashi";
////        name[0] = "Abhay";        // array access notation is not used
//          name = "Abhay";
//        System.out.println(name);
//
//     //string comparison => == , .equals , equalsIgnoreCase
//
//        String name1 = "Love";
//        String name2 = "Love";
//
//        if(name1.equalsIgnoreCase(name2)){
//            System.out.println("Both strings are equal");
//        }else {
//            System.out.println("Both strings are not equal");
//        }
//
//
//        // String input  => next() :- if spaces comes then it stops to take input.
//                          //nextLine():- it allow spaces also.
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("provide the string content");
////        String str = sc.nextLine();
////        System.out.println("value is:" + str);
//
//        //empty --> length = 0
//        // blank --> empty or sirf spaces h string
//        String Str = "";
//        System.out.println(Str.length());
//        System.out.println(Str.isEmpty());
//        System.out.println(Str.isBlank());
//
//        // .trim()
//
//        String Name = "    baba    ";
//        System.out.println(Name.length());
//        System.out.println(Name);
//        Name = Name.trim();
//        System.out.println(Name.length());
//
//        // toUpperCase and toLowerCase
//
//        String frnd = "golu";
//        System.out.println(frnd.toUpperCase());
////        System.out.println(frnd.toUpperCase());
//
//        // .substring();
//
//        String myName = "My Name is Shashi";
//        System.out.println(myName.substring(0,6));   // o-->include , 6-->exclude
//
//        // .contains
//        System.out.println(myName.contains("Shashi"));
//
//        // .valueOf--> ye kisi bhi data ko string mei convert krta hai
//
//        int number = 5123;
//        String letter = String.valueOf(number);
//        System.out.println(number +1);
//        System.out.println(letter +3);
//
//        // .startwith(); and enswith();
//
//        String myname = "shashikant-bhardwaj";
//        System.out.println(myname.startsWith("shashikant"));
//        System.out.println(myname.endsWith("bhardwaj"));
//
//        // .toCharArray();
//        String name3 = "bhardwaj";
//        char[] crr = name3.toCharArray();
//        for(char ch: crr){
//            System.out.println("value of char:" + ch);
//        }
//
//
//        // .split() --> give string array
//        String [] words = myname.split("-");
//        for(String val: words){
//            System.out.println(val);
//        }
//
//
//        // .replace(oldChar:"" , newChar:"");
//
//       String nm = "babbar";
//        nm = nm.replace()




        //practice questions

        //1.print each character of the string
        String str = "NOON";
        printstring(str);

        //2. count length of string without using length();
        // using above str value for this
        int length = getLengthOfString(str);
        System.out.println(length);

        //3. count vowel in a string

        int vowels = countVowel(str);
        System.out.println(vowels);

        //3. reverse a string
        String reverse = reverseString(str);
        System.out.println(reverse);

        //4. palindrome or not
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);









    }
}
