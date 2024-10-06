import java.util.*;
public class basic_Patterns {

    public static void main(String[] args) {
        //Pattern -1
/*
n=6
     *
    *  *
   *    *
  *      *
 *        *
*          *
 *        *
  *      *
   *    *
    *  *
     *
*/
//for i=1; 5 spaces -->n-i spaces
//for i=2; 4 spaces
//for i=3; 3 spaces
//for i=4; 2 spaces
//i=5;1 spaces
//i=6; 0 spaces

//observe by drawing like matrix if j=2*i-1 then * else Spaces:
        /*  Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/

        //2nd Method--

        /*
        6
     *
    *  *
   *    *
  *      *
 *        *
*          *
 *        *
  *      *
   *    *
    *  *
     *
         */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("*");
            }
            else {
                System.out.print("*");
                for (int j = 1; j <2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

            //for reverse Printing

            for(int i=n-1;i>=1;i--) {
                for (int j = 1; j <=n-i;j++) {
                    System.out.print(" ");
                }
                if (i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                    for (int j = 1; j <2 * i - 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }




        //Pattern-2
     /*
  n= 6
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6
      */

        /*
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
*/
    }
}
