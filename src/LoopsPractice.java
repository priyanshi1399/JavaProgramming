import java.util.*;
public class LoopsPractice {
    public static void main(String[] args) {
        //Take n from User and Print the Pattern

      /*
Enter the number:
6
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

       */

      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

       */


        //take n from user and based on n value print the number changing pattern
/*
Enter the number:
6
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21

 */
        /*
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=input.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        } */

        //Print Pattern like below
/*
Enter the number:
6
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
*/

        /*
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
*/

//logic was when you observe (i+j)%2==0 if even then prints 1 else 0;
        //Print below Patterns

       /*
Enter the number:
6
0
1 0
0 1 0
1 0 1 0
0 1 0 1 0
1 0 1 0 1 0
        */

       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2!=0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        */

        /*
        Print pattern like this
       n= 6
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6

         */

        //logic here is (n-i) spaces after observing then printing i
       /* Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { //spaces to print
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " "); //print 1  2 2 like this
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); //this is to print spaces
            }
            System.out.println();
        } */


        //Print diamond Pattern
/*
Enter the number:
6
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
 */
        //logic is to print spaces first n-i spaces and 2*i-1 stars
        // then goes to reverse loop starts from n-1 and printing n-i spaces and then 2*i-1 stars
       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        } */
        //while loop
 /*
 int i=1;
 while(i<=3){
     System.out.println(i);
     i++;
 }
 */
// System.out.print("i value after loop is=" +i); */
 /*
 i=1,condition is true
 print 1
 i=2,condition is true
 print 2
 i=3, condition is true
 print 3
 i=4
 */

//TAKE A NON NEGATIVE INTEGER FROM USER and print the sum
 /*n=468
 output=18
 use while loop
 */
       /*
       logic n=468; digit=8 (remainder);sum=0+8; n=46;n>0;digit=6(rem);sum=8+6=14;n=4,4>0 digit=4;sum=18;n=4%10=0;
        */
       /* Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("The sum of the number is: "+sum);
*/

        //do while loop
 /*int i=1;
 while(i<=3){
     System.out.println(i);
     i++;
 }
 System.out.println("Do while loop");
 i=4;
 do{
     System.out.println(i);
     i++;
 } while(i<=3);
 */
        //using do while print table of 5
      /*  int i=1;
        do{
            System.out.println(5*i);
            i++;
        }
        while(i<=10); */

        // Butterfly Pattern
/*
6
*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *

 */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
