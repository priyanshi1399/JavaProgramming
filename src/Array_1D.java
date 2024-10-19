import java.util.Scanner;
public class Array_1D {

    public class Main
    {
    /*public static void printArrayElement(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(i +" :"+arr[i]);
        }
    }
    */
        //method to find minimum value in array
  /*  public static int findMinimum(int [] arr){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;

    }*/

      /*public static int findMin(int [] arr){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
        ans=Math.min(ans,arr[i]);
        }
        return ans;
      }
    */


    /*
public static int sumOfArray(int [] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum;
}*/


        /* calculate 3rd Question*/

        public static int[] findMinAndSecondMin(int [] arr){
            int min=Integer.MAX_VALUE;
            int secondMin=Integer.MAX_VALUE;
            //2 1 0
            //min=Integer.MAX_VALUE;
            //secondMin=Integer.MAX_VALUE;
            // min=2->1
            //secondMin=2
            //min=1
            //secondMin=1
            //min=0
            //3 1 2  check for this test case because earlier it was failing
            //secondMin=3
            //Min=1 //here else condition you need to write
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    secondMin=min; //here secondmin will become 2
                    min=arr[i];
                }
                else if(arr[i]<secondMin){
                    secondMin=arr[i];
                }
            }
            return new int []{min,secondMin};
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

            //	printArrayElement(arr);

            //	int s=sumOfArray(arr);
            //	System.out.println("Sum of array elements:"+s);
            //System.out.println(sumOfArray(arr));

/*	int min=findMinimum(arr);
	System.out.println(min);*/
/*
	int k=System.out.println(findMin(arr));
	System.out.println(k);
	*/


            if(arr.length>=2){
                int [] result=findMinAndSecondMin(arr);
                System.out.println("Min element=" +result[0]);
                System.out.println("Second min element"+result[1]);
            }

        }
    }

}
