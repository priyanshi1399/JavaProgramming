public class ArrayBasics {
    public class Main
    {
        //it helps the code with reusability :method
/*
    public static int add(int x,int y){
        //int z=x+y;
        System.out.println("x=" +x);
        System.out.println("y="+y);
        return x+y;
    }
    */
    /*
     public static void  add(int x,int y){
        //int z=x+y;
        System.out.println("x=" +x);
        System.out.println("y="+y);
        System.out.println("x+y=" +(x+y));
    } */
        //Pass by reference
        public static void incrementByOne(int [] nums){
            for(int i=0;i<nums.length;i++){
                nums[i]=nums[i]+1;

                //this nums is the reference of arr.
                //anything that updates in method will be updated in arr//
                //array get updated wherever you call from
                //it will be updated.nums pointing to exact copy of arr


            }
        }

        public static void incrementByOneForInteger(int x){
            x=x+1;
        }

        public static void main(String[] args) {
            int [] arr;//declaration
            arr=new int [5];//memory allocation;
            //int [] arr=new int[5];
            System.out.println(arr.length);
            for(int i=0;i<5;i++){
                System.out.println(i+ " :" + arr[i]);
            }
            for(int i=0;i<5;i++){
                arr[i]=i*2;
                System.out.println(i +" :" + arr[i]);
            }
		/*
		int ans1=add(4,5);
		System.out.println(add(4,6));
		//add(2,9); instead write like below
		System.out.println(add(2,9));
		*/

            // add(4,5);
            //  add(2,9);

            incrementByOne(arr);
            for(int i=0;i<5;i++){
                System.out.println(i + ":" +arr[i]);
            }

            //calling incrementByOneForInteger
            int a=5;
            incrementByOneForInteger(5);
            System.out.println(a);// here a=5 because here it dosent reference it gets created new reference
            //so new value will be 5 only
        }
    }

}
