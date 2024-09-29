/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
import java.util.*;
public class Basic_Loops
{
    public static void main(String[] args) {


                //for loop
                //int i=0-->initialization of your loop
                //i<3-->condition for loop to execute
                //i++-->how i will be incremented after every iteration
		/*i=0
		i=1
		*/

		/*
		output
		i=0;
		i=1;
		i=2
		*/
	/*	for(int i=1;i<=10;i++){
		    System.out.println("i=" +i);
		}
		/*
		i=2
		j=0;j<=2
		j=0;j<=3
		*/
		/*
		01
		012
		0123
		*/

             /*   for(int i=1;i<=3;i++){
                    for(int j=0;j<=i;j++){
                        System.out.println(j);
                    }
                    System.out.println();
                }*/

        //Take n from and based on n value and print the increasing pyramid pattern

		/*
		n=6
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		*/
	/*	Scanner input=new Scanner(System.in);
		int n=input.nextInt();

		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
	*/



        //take n from user and basedon n value print the number changing pattern

	/*
n=6
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21

	*/

	/*
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int count=1;
	for(int i=1;i<=n;i++){
	    for(int j=1;j<=i;j++){
	        System.out.print(count +" ");
	        count++;
	    }

	    System.out.println();
	} */




	/*
We are getting our pattern like this
6
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1
0 1 0 1 0 1
	*/
//but here we want pattern is different
/*
6
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1

*/

        //
	/*Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int num=1;
	for(int i=1;i<=n;i++){
	    for(int j=1;j<=i;j++){
	        System.out.print(num+ " ");
	      num=(num==1)?0:1;
	    }
	    System.out.println();
	}*/

//we want out pattern like this obseravation that (i+j)%2==20then printing 1 else 0

/*
6
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1

*/

/*	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int num=1;
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
	}*/



/*


6
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6


*/

/*	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	for(int i=1;i<=n;i++){
	    //print n-i spaces
	    for(int j=1;j<=n-i;j++)
	     System.out.print(" ");
	     for(int j=1;j<=i;j++)
	         System.out.print(i+ " ");
	     System.out.println();
	     }*/




        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>=i;j--){
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
        }








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

 /*Scanner input=new Scanner(System.in);
 int n=input.nextInt();
 //468
 int sum=0;
 while(n>0){
     int digit=n%10;
     sum=sum+digit;
     n=n/10;
 }
 System.out.println(sum);
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

 /*
 int i=1;
 do{
     System.out.println(5*i);
     i++;
 }
 while(i<=10);

 */



        // Butterfly Pattern
 /*Scanner input=new Scanner(System.in);
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
 */

    }
}
