import java.util.*;
public class Operator_data_types_if_else {
        public static void main(String[] args) {
            //******************************Qus-1 Minimum of three number*********************************************
        /*Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int minNum=num1;
        if(num2<minNum){
            minNum=num2;
        }
        if(num3<minNum){
            minNum=num3;
        }
        System.out.println("Minimum of all three number is: "+minNum); */


            //***************************************************Qus2-boys21&Girl18 of Marriage*************************

       /*System.out.println("Checking Couple Eligibility for Marriage");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Age of Girl");
        int girlAge=input.nextInt();
        System.out.println("Enter the Age of Boy");
        int boyAge=input.nextInt();
        if(girlAge==18 && boyAge==21)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        } */

            //*****************************Que3 -Print Tax using ternary Operator *********************************************************
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the bill");
        double bill=input.nextFloat();
        double tax=(bill>=50000)?((bill*10)/100):((bill*5)/100);
        System.out.println(tax);

        //*****************************************Qus: 4Leap Year**************************************************
      /*  System.out.println("Leap year");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        boolean isLeap=false;

        if(year%100==0 && year%400==0){
            isLeap=true;
        }
        if(year%4==0 && year%100!=0){
            isLeap=true;
        }
        System.out.println(isLeap); */


            //**************************************Ques:5-Odd or Even ************************************************************
  /* Scanner input=new Scanner(System.in);
   System.out.println("Enter the number of elements you wish to enter: ");
   int n=input.nextInt();
   if(n%2==0){
       System.out.println("num is Even");
   }
   else{
       System.out.println("num is Odd");
   } */

//*********************************Ques:6-Maximum of Three***************************************************************
      /* Scanner input=new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1=input.nextInt();
        System.out.println("Enter second Number");
        int num2=input.nextInt();
        System.out.println("Enter third Number");
        int num3=input.nextInt();
        int numMax=num1;
        int c=Math.max((Math.max(num2,numMax)),num3);
        System.out.println("Maximum element of three number :"+c); */

            //***********************************Q-6-Mid Element in Three***************************************************
           /* Scanner input = new Scanner(System.in);
            System.out.println("Enter three Elements");
            System.out.println("Enter first Element: ");
            int num1=input.nextInt();
            System.out.println("Enter second Element: ");
            int num2=input.nextInt();
            System.out.println("Enter third Element: ");
            int num3=input.nextInt();
            if(num1<num2 || num1<num3) {
                if (num1 > num2 || num1 > num3) {
                    System.out.println("Mid element is: " + num1);
                }
            }
            if(num2<num1 || num2<num3){
                if(num2 > num1 || num2 > num3) {
                    System.out.println("Mid element is: "+num2);
                }

            }
            if(num3<num1 || num3<num2){
                if(num3 > num1 || num3 > num2) {
                    System.out.println("Mid element is: "+num3);
                }

            }
*/
            //*******************Second Method of Ques6 Middle element*********************************************************

        /*Scanner input=new Scanner(System.in);
        System.out.println("Enter Three Element: ");
        System.out.println("Enter first Element: ");
        int num1=input.nextInt();
        System.out.println("Enter second Element: ");
        int num2=input.nextInt();
        System.out.println("Enter third Element: ");
        int num3=input.nextInt();

        if((num1>num2 && num1<num3) || (num1>num3) &&(num1<num2)){
            System.out.println("Middle element is: " +num1);
        }
        else if((num2<num1 && num2>num3) ||(num2<num3 && num2>num1)){
            System.out.println("Middle element is: " +num2);
        }
        else{
            System.out.println("Middle element is: " +num3);
        }*/

        }
    }


