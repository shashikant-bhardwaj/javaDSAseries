

public class PatternPrinting{
    static void main() {

        // Pattern Printing

        //Pattern 1 (square)
        /*int n = 3;
        //row loop
        for (int row = 1; row <= n; row++) {
            //colunm loop
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        */


        // Pattern 2 (rectangle)
           /*int n = 3;
        //row loop
        for (int row = 1; row <= n; row++) {
            //colunm loop
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        */

        //Pattern 3 (right angle triangle)

        /*int n = 5;

        //row loop
        for (int row = 1; row <= n; row++) {
            //column loop
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */


        //Pattern 4 (solid rohmbus)

        /*int n = 5;
        //row loop
        for (int row = 1; row <= n; row++) {
            //column loop , for each row --> spaces ,star

            //spaces
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }

            //star
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        //Patten 5 (inverted right angle triangle

        /*int n = 5;
        //row loop
        for (int row = 1; row <= n; row++) {
            //column loop
            for (int col = 1; col <= (n-row)+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        //Pattern 6(pyramid)

        /*int n = 5;
        //row loop
        for (int row = 1; row <= n; row++) {
            //column loop , for each row --> spaces , stars

            //spaces
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            //stars
            for (int col = 1; col <= 2*row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */

        //Pattern 7 (inverted pyramid)

        /*int n = 4;
        //row loop
        for (int row = 1; row <= n; row++) {
            //column loop , for each row --> spaces , stars

            //spaces
            for (int col = 1; col <= row-1; col++) {
                System.out.print("  ");
            }
            //stars
            for (int col = 1; col <= 2*n - (row + (row-1)); col++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

        //Pattern 8 ( hollow rectangle)

       /* int n = 4;
        //row loop
        for (int row = 1; row <= n; row++) {
            //column loop , for each row --> 6 column
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == n) {
                    System.out.print("* ");
                }
                else{
                    //middle rows
                    if (col == 1 || col == 6) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }

                }

            }
            System.out.println();
        } */

        //Pattern 9(hollow right angle triangle

        /*int n = 5;
        //row loop
        for (int row = 1; row <= n; row++) {
            //for each row --> variable column
            if(row == 1 || row == 2 || row == 5){
                for(int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }

            }else{

                //middle rows

                //1*
                System.out.print("* ");
                //(row-2) spaces
                for(int col = 1; col <= (row-2); col++) {
                    System.out.print("  ");
                }

                //1*
                System.out.print("* ");
            }
            System.out.println();
        } */

        //Pattern 10(hollow  pyramid)

        /*int n = 5;
        //row loop
        for (int row = 1; row <= n; row++) {
            //for each row --> spaces , stars

            //spaces
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }

            //stars and spaces both
            if(row == 1 || row == n){
                for (int col = 1; col <= (2*row)-1; col++) {
                    System.out.print("* ");
                }

            }else{
                //1*
                System.out.print("* ");
                //(2*row-3)spaces
                for (int col = 1; col <= (2*row)-3; col++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();
        }*/


        //Pattern 11(solid diamond)
        //part 1
        /*int n = 4;
        //row loop
        for(int row = 1;row <= n; row++){
            //for each row--> spaces , star

            //spaces
            for(int col = 1; col <= n-row; col++){
                System.out.print("  ");
            }
            //star
            for(int col = 1; col <= (2*row - 1); col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //part 2

        for(int row = 1;row <= n; row++){
            if (row == 1){
                continue;
            }
            //for each row--> spaces , star

            //spaces
            for(int col = 1; col <= (row - 1); col++){
                System.out.print("  ");
            }

            //stars
            for(int col = 1; col <= 2*n - (row + (row - 1)); col++){
                System.out.print("* ");
            }
            System.out.println();
        } */

        //Pattern 12 (hollow solid diamond)

        //part 1

        /*int n = 4;
        //row loop
        for (int row = 1; row <= n; row++) {
            //for each row --> spaces , stars

            //spaces
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }

            //stars and spaces both
            if(row == 1){
                for (int col = 1; col <= (2*row)-1; col++) {
                    System.out.print("* ");
                }

            }else{
                //1*
                System.out.print("* ");
                //(2*row-3)spaces
                for (int col = 1; col <= (2*row)-3; col++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();
        }

        //part 2

        for (int row = 1; row <= n-1; row++) {
            //for each row --> spaces , star and spaces both

            //spaces
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }

            //star and spaces
            if(row == n-1){
                System.out.print("* ");
            }else{
                //1*
                System.out.print("* ");
                //spaces
                for (int col = 1; col <= 2*(n-row) - 3 ; col++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();

        } */

        //Pattern 13( complex )

        //part 1
       /* int n = 4;
        //row loop
        for (int row = 1; row <= n; row++) {
            //column loop-->right angle triangle
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //middle spaces
            for (int col = 1; col <= 2*(n-row); col++) {
                System.out.print("  ");
            }

            // column loop --> second right angle triangle
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //part 2
         //row loop
          for (int row = 1; row <= n; row++) {
              //column loop -->inverted right angle triangle
              for (int col = 1; col <= (n-row) + 1; col++) {
                  System.out.print("* ");
              }

              //middle spaces
              for (int col = 1; col <= (2*row)-2 ; col++) {
                  System.out.print("  ");
              }

              //stars
              for (int col = 1; col <= (n-row)+1; col++) {
                  System.out.print("* ");
              }
              System.out.println();
          } */

        //Pattern 14(numeric right angle triangle)

        /*int n = 5;
        for (int row = 1; row <= n; row++) {
            //for each row --> variable column
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        } */

        //Pattern 15(numeric right angle)

       /* int n = 5;
        int count = 1;

        for (int row = 1; row <= n; row++) {
            //for each row -->variable column
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        } */

        //Pattern 16(char right angle)

       /* int n = 5;
        for (int row = 1; row <= n; row++) {
            //for each row --> variale column
            for (int col = 1; col <= row; col++) {
                int a = col;
                int b = ('A' - 1);
                int ans = a + b;
                char finalans = (char) ans;
                System.out.print(finalans + " ");

            }
            System.out.println();
        } */


        //Pattern 17(reverse char right angle)
        /*int n = 5;
        for (int row = 1; row <= n; row++) {
            //for each row --> variable column
            for(int col = 1; col <= row; col++) {
                int a = n - col;
                int b = 'A';
                int ans = a + b;
                char finalans = (char)ans;
                System.out.print(finalans + " ");
            }
            System.out.println();
        } */



        //Pattern 18(numeric  pyramid)
        /*int n = 4;
        for (int row = 1; row <= n; row++) {
            //for each row --> spaces , numbers

            //part 1
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");

            }

            //part 2
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            //part 3
//            int rowValue = row;
            int decRowValue = row - 1;
            for (int col = 1; col <= row-1; col++) {
                System.out.print(decRowValue + " " );
                decRowValue--;
            }
            System.out.println();

        } */


        //Pattern 19(numeric pyramid)

        /*int n = 4;
        for (int row = 1; row <= n; row++) {
            //for  each row --> spaces , numbers

            //spaces
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }

            //mumbers
            for (int col = 1; col <= (2*row) - 1; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        } */

        //Pattern 20
       /* int n = 4;
        for (int row = 1; row <= n; row++) {
            //for each row --> spaces , char

            //part 1
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }

            //part 2
            for (int col = 1; col <= row; col++) {
                int a = col;
                int b = ('A' - 1);
                int ans = a + b;
                char finalans = (char)ans;
                System.out.print(finalans + " ");
            }

            //part 3
            char ToPrint = (char)(row + ('A' - 2));
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(ToPrint + " ");
                ToPrint--;
            }
            System.out.println();

        } */


    }

}