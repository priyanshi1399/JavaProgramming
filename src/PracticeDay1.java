import java.util.*;
public class PracticeDay1
{
    public static void main(String[] args) {
        //	System.out.println("Hello World");
        //	Scanner input=new Scanner(System.in);
        //	boolean choice=input.nextBoolean();
        //	System.out.println("Current Age is:"+age);
        //System.out.println("Max range of integer:"+Double.MAX_VALUE);
        //	System.out.println("Max range of integer:"+Double.MIN_VALUE);
//	System.out.println("choice is "+choice);
        //System.out.println("Enter two numbers");
        //	int a=10;
        //	int b=3;
        //	int a=10;
        //	int b=-a;
        //	boolean choice=true;
        //	System.out.println(a+b);
        //	System.out.println(a-b);
        //	System.out.println(a*b);
        //	System.out.println((double)a/b);
        //	System.out.println(a%b);
//	System.out.println(!choice);
//	System.out.println(++a); //preincrement operator->first increment the value then uses it
//	int x=++a+b; //first increment value 12-10
//	System.out.println(x);
//	System.out.println(a++);// here value is 12; first I have printed as 11 the  do ++ then print this value 11
//	System.out.println(a);
//	System.out.println(a);

        int a=10;
        //a+=5;
//	a-=5;
//	a*=5;
        int b=5;
        System.out.println("Assignment Operator");
        System.out.println(a);
        System.out.println(a==b); //false
        System.out.println("Relational Operator");
//	b=a;//assignment
        System.out.println(a==b); //true
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println("Logiocal Operator");
        //T && T=T
        //T&& F=F
        //F&&T =F
        //F && F=F
        boolean c=true;
        boolean d=false;
        System.out.println(c&&d);
        System.out.println(c ||d); //if one of them is true

        System.out.println("Bitwise Operator");
        int a1=3; //011
        int b1=6; //110
        System.out.println(a1^a1);
        //int c=if(condition)? true then this part: else this part is executed
        int c1=(a1<b1)?5:6;
        System.out.println(c1);
        //shift operation
        int e=3;//011
        int f=6;//110
        System.out.println(e<<1);// left shift by 1
        System.out.println(e<<2); //multiplication by 2
        System.out.println(e>>1); //division by 2
//	1^1=0;
//	1^0=1;
// 0^1=1;
// 0^0=0;
        //if both bits are same then give 0 else 1

        System.out.println("Conditional Statement");
        int g=5;
        int h=3;
        int s=(g>h)?8:10;
        if(g==h){
            System.out.println("True Part");
            s=8;
        }
        else if(g>h){
            System.out.println("Condition 2");
            if((g+h)>10){
                System.out.println("Consition 2.1 is executed");
                s=12;
            }
            else{
                System.out.println("Consition 2.2");
            }
        }
        else{
            System.out.println("false Part");
            s=10;
        }
        //***************************Switch Statement********************************
        int choicee=1;
        switch(choicee){
            case 1:
                System.out.println("1"); //of dont want to go any other case then break; otherwise will print 1,2,3
                break;
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            default:
                System.out.println("default");
        }


    }
}
//2147483647
//Max range of integer:1.7976931348623157E308
//Max range of integer:4.9E-324
//
