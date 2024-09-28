import java.util.Scanner;

public class Operators {
    /******************************************************************************

     Welcome to GDB Online.
     GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
     C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
     Code, Compile, Run and Debug online from anywhere in world.

     *******************************************************************************/

        public static void main(String[] args) {
	/*	System.out.println("Arithmetic Operations");
		int a=10;
		int b=3;
		System.out.println((a+b));
		//adding two operands ,require 2 operands
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double)a/b);
		System.out.println(a%b);*/

            //***********************unary *****************
            //System.out.println("Unary Operand");
            //they just require one operand to operate
	/*	int a=+10;
		int b=-a;
		int c=+a;
		boolean choice=true;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(!choice);
		//Pre and Post increment Operators
		System.out.println(++a);
		//Preincrement operator which increment value of a by 1 then print then use the value //a=11;
		int x=++a + b ;//12-10=2
		System.out.println(x);
	*/
/*	int a=10;
	System.out.println(--a); //a=9
	System.out.println(a--);//first 9 will be printed then decrement it to  8
	System.out.println(++a);
	System.out.println(++a);
	System.out.println(a++);//first use the value of a then use it,here a=11
	System.out.println(a); //now value will become 12
	int x=2;
	int y=3;
	int z=++x + y++;
	System.out.println(y); //here will print 4
	System.out.println(z); //here ++x first increment then  use using 3
	//y++ first use it then increment it using 3 increment it to 4 but at time of sum uses 3
*/

//****************************Assignment Operator******************
/*System.out.println("Assignment Operator");
int a=10;
//a=a+5;
a+=5; //a=a+5;
a-=5; //a=a-5;
System.out.println(a);*/


//*******************************Relational Operators******************************
/*int a=10;
int b=5;
//b=a; //Assignment Operator
System.out.println(a==b); //false //it checks the value not assigning
System.out.println(a>b); //true
System.out.println(a>=b);//true
System.out.println(a<b);//false */


//********************************Logical Operators***********************************
/*System.out.println("Logical Operator");
boolean a=true;
boolean b=false;
//T && T=T
// T&& F=F
//F&&T=T
// F && F=F

System.out.println(a &&b);
System.out.println(a || b); //true*/

//*************************************Bitwise Operations**************************

/*System.out.println("Bitwise Operator");
int a=3 ;//011  can
int b=6;//110
//do bit by bit 0 1 0 , 0 for false 1 for true
System.out.println(a&b); //2
System.out.println(a|b ); // bit by bit try to do or if any 1 is there 1

//1^1=0
//1^0=1
//0^1=1
//0^0=0
//if both the bits are same then 0 otherwise 1 XOR Operation
System.out.println(a^b);
// 1 0 110 this will be 5
System.out.println(a^a); //011 ^011 =0 0 0

*/

//****************************ternary Operation****************************************
/*System.out.println("Ternary Operation");
int a=3;
int b=6;
//int c=(condition)? if this condition is true this is executed:else this part is executed
int c=(a<b)?5:6;
System.out.println(c);

*/
//**********************************Shift Operator*******************************************
//System.out.println("Shift Operator");
/*int a=3;//011
int b=6;//110
//System.out.println(a<<1); //011 shift one position to left 0 will be added ,become0110
//System.out.println(a<<2);//01100

//basically its multiplication by 2
//System.out.println(a<<3);//011000
System.out.println(a>>1);//01
System.out.println(a>>2);////0
//right shift is division by 2*/


//************************************conditional Statements***********************************
   /* int a=5;
    int b=3;
    //int c=(a>b)?8:10;
    int c;
    if(a==b){
        //True Part
        System.out.println("True Part");
        c=8;
    }
    else{
        //False Part
        System.out.println("False Part");
        c=10;
    }
    System.out.println(c);*/
   /* if(condition){
        //condition is true
    }
    else{
        //condition is false
    }*/


  /*  int a=5;
    int b=3;
    int c;
    if(a==b){
        //true Part
        System.out.println("Condition 1 is true");
        c=8;
    }
    else if(a>b){
    System.out.println("condition 2 is true");
    if((a+b)>10){
        System.out.println("Condition 2.1 is true");
        c=12;
    }
    else{
        System.out.println("Condition 2.2 is true");
        c=13;
    }
    }
    else{
        //false Part
        System.out.println("False Part");
        c=10;
    };
    System.out.println(c);*/


            //**********************************Switch Statement************************************
   /* int choice=2;
    switch(choice){
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        case 4:
            System.out.println("4");
            break;
            //all these 2,3,4 will be written to avoid this put break
        default:
            System.out.println("default");
    }
*/

//**********************Question******************************

//take three input from user and print the maximum of three

/*Scanner input=new Scanner(System.in);
System.out.println("Enter three numbers");
int num1=input.nextInt();
int num2=input.nextInt();
int num3=input.nextInt();

int maxNum=num1;
if(maxNum<num2){
    maxNum=num2;
}
if(maxNum<num3){
    maxNum=num3;
}
System.out.println("Max number is"+maxNum);
*/

/*
another way
Scanner input=new Scanner(System.in);
System.out.println("Enter three numbers");
int num1=input.nextInt();
int num2=input.nextInt();
int num3=input.nextInt();
int maxNum=Math.max((Math.max(num1,num2)),num3);
System.out.println("Max number is"+maxNum);
*/


//*************check the year is leap or not*******************************

//if divisible by 400 then divisible by 100

            Scanner input=new Scanner(System.in);
            System.out.println("Enter year");
            int year=input.nextInt();
            boolean isLeap=false;
            if(year%100==0 && year%400==0){
                isLeap=true;
            }
            else if(year%4==0 && year%100!=0){
                isLeap=true;
            }
            System.out.println(isLeap);


        }
    }


