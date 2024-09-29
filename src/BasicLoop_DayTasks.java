import java.util.*;
public class BasicLoop_DayTasks {

    public static void main(String[] args) {
        //**************************Q-1-sum of first 10 natural number***********************************************
     /*   int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println(sum);
*/
     //*******************************Q-2-Digits reversed*********************************************************
       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=input.nextInt();
        while(n>0){
            int digit=n%10;
            n=n/10;
            System.out.print(digit);
        }
        */


        //****************************Q-3 Multiplication Table*********************************************
      /*  Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n*i);
            i++;
        }

       */

        //**************************************Q-4 first N odd Number******************************************
       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=input.nextInt();
        int i=1;
        while(i<=n){
            if(i%2==1){
                System.out.println(i);
            }
            i++;
        }
*/
        //*********************Q-5 factorial of n Number********************************************************

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=input.nextInt();
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);

    }
    }


