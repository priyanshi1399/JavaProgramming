public class Arrays {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=40;

        // int[] arr; //this is how array is defined
        //  arr=new int[4]; //there will be 4 element putting it into 1 line
        System.out.println("Array elelement before assigning values");
        int [] arr=new int[4];
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
        //we have group of 4 integers and they will be stored together in memory
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        //they are use for managing collection of data effeciently.
        //all the items have continuous memory allocations.
        for(int i=0;i<4;i++){
            arr[i]++;
        }
        boolean [] arrBoolean=new boolean[4];
        System.out.println("Boolena Array element before assigning values");
        for(int i=0;i<4;i++){
            System.out.println(arrBoolean[i]); //this returns false
        }
    }
}
