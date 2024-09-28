import java.util.*;
public class DataType {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int age=25;
//        int previousAge=age-24;
//        System.out.println("Current age:"+age);
//        System.out.println("Age of the person in 2000 was: "+previousAge);
        //int age=25;
// System.out.println("age is:" +age);
// System.out.println("mx range of integer "+Integer.MAX_VALUE);
// System.out.println("min range of integer "+Integer.MIN_VALUE);
        //int x=2147483649; //this will give error because can't store value greater than Integer
        //System.out.println("x is:" +x);
        //take input from User
//        System.out.println("Enter a number");
//        Scanner input=new Scanner(System.in);
        //  int age=input.nextInt();
        //   System.out.println("age is:" +age);
// System.out.println("max range of integer "+Integer.MAX_VALUE);
        //System.out.println("min range of integer "+Integer.MIN_VALUE);

        //  ******taking long value*****
        // long age=input.nextLong();
        // System.out.println("Current age is: "+age);
        // System.out.println("Max range of Integer "+Long.MAX_VALUE);
        // System.out.println("Min range of Integer "+Long.MIN_VALUE);
//if you are not able to store integer then store it in long
//        Current age is: 2147483649
//        Max range of Integer 9223372036854775807
//        Min range of Integer -9223372036854775808

        //*********taking decimal values*******
//        System.out.println("Enter a number");
//        Scanner input=new Scanner(System.in);
//        float age=input.nextFloat();
//        System.out.println("The current age is "+age);
//        System.out.println("Max range of float:"+Float.MAX_VALUE);
//        System.out.println("Min range of float:"+Float.MIN_VALUE);

//        Max range of float:3.4028235E38 this is E38-10^38
//        Min range of float:1.4E-45 10^45

        //if you need more decimal point generally double is preferred

        //******************************double******************
//        System.out.println("Enter a number");
//        Scanner input=new Scanner(System.in);
//        double age=input.nextDouble();
//        System.out.println("The current age is "+age);
//        System.out.println("Max range of double:"+Double.MAX_VALUE);
//        System.out.println("Min range of double:"+Double.MIN_VALUE);

//        25.5555555555555555555555555555
//        The current age is 25.555555555555557
//        Max range of double:1.7976931348623157E308
//        Min range of double:4.9E-324
        //******************************bool data type********************************

        System.out.println("Enter True or False");
        Scanner input=new Scanner(System.in);
        boolean choice=input.nextBoolean();
        System.out.println("The current age is "+choice);


    }
}
//age=25 25 is the integer-->2024
//What was the age of the Person in 2000
//variable is memory location that can store value
//4 bytes location age--25

