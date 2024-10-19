import java.util.Scanner;
public class ArrayQuestion {
    //Take number of elements in array from the user,
//take all the element also from the user and print your array by creating a NoSuchMethodError

    public class Main
    {
        public static void printArrayElement(int [] arr){
            for(int i=0;i<arr.length;i++){
                System.out.println(i +" :"+arr[i]);
            }
        }

        public static int sumOfArray(int [] arr){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
        }


        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number of elements in the array");
            int n=input.nextInt();
            int [] arr=new int[n];
            System.out.println("Enter the number for array element");
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }

            printArrayElement(arr);

            //	int s=sumOfArray(arr);
            //	System.out.println("Sum of array elements:"+s);
            System.out.println(sumOfArray(arr));
        }
    }

}
