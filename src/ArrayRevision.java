import java.util.Scanner;
public class ArrayRevision {
    // Take n from the user, then create an array of n elements and take the elements of the array from the user and print the sum of entire array.
// The sum of entire array should be written in a method/function

//static will call static methods



        public static int sum(int [] arr){
            int sum=0;
            // 2 6 8
            //sum=2->8(2+6)--->16(8+8)
            //i=0
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }
            return sum;
        }


        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the Array Size");
            int n=input.nextInt();
            int [] arr=new int[n];
            System.out.println("Entering the array elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=input.nextInt();
            }
            //	int s=sum(arr);
            System.out.println("The sum of array elements is: "+sum(arr));

        }
    }


