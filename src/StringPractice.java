public class StringPractice {

    static int countConsonants(String str) {
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            }else{
                count++;
            }
        }
        return count;
    }

    static String removespaces(String name) {
        return name.replaceAll(" ", "");

    }

    static int countWords(String str) {
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n ; i++) {
            count++;
        }
        return count;
    }

    static String upperCase(String str) {
        int n = str.length();
        String upper = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                upper += (char)(ch - ('a' - 'A'));

            }else{
                upper += ch;
            }
        }
        return upper;
    }

    static int countFrequency(String str) {
        int count = 0;
        int n = str.length();
        char Target = 'a';
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == Target) {
                count++;
            }
        }
        return count;
    }

    static Boolean onlyDigits(String str1) {
        boolean onlyDigits = true;
        int n = str1.length();
        for (int i = 0; i < n; i++) {
            char ch = str1.charAt(i);
            if(ch < '0' && ch > '9') {
                onlyDigits = false;
            }else{
                onlyDigits = true;
            }
        }
        return onlyDigits;
    }

    static void main() {
        //1. count consonants in a string
        String str = "ShashiKant";
        int Consonants = countConsonants(str);
        System.out.println(Consonants);

        //2. remove all  spaces from a string
        String name = "  ShashiKant Bhardwaj  ";
        name = removespaces(name);
        System.out.println(name);

        //3. count words in a string
        int words = countWords(str);
        System.out.println(words);

        //4. convert in upperCase without method
        String upper = upperCase(str);
        System.out.println(upper);

        //5.find frequency of a character
        int chr =  countFrequency(str);
        System.out.println(chr);

        // check if string contain onlyDigits
        String str1 = "abc";
        boolean onlyDigits = onlyDigits(str1);

        System.out.println(onlyDigits);


    }
}
