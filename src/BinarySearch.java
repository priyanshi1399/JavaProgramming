public class BinarySearch {

    public static void main(String [] args){
        int [] nums={1,0,3,5,9,12};
        int target=9;
        int k=search(nums,target);
        System.out.println(k);
    }

    public static int search(int[] nums, int target) {
        /*
        //first figure out the upper bound and then find the index of the element
        int n=nums.length;
         int l=0;
         int h=n;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]<=target){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
       int upperBound=l;
       if(upperBound-1>=0 && nums[upperBound-1]==target){
        return upperBound-1;
       }
       else{
        return -1;
       }
*/
//first figure out the lower bound and then find the index of the element
        int n=nums.length;
        int l=0;
        int h=n;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        int lowerBound=l;
        if(lowerBound<n && nums[lowerBound]==target){
            return lowerBound;
        }
        else{
            return -1;
        }

       /* int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>target){
                h=mid-1;
            }
            else if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
        }
        return -1;*/

        /*for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;*/
    }
  //  T(C)-1..n/2..n/4..n/8...n/k. k+1 iteration.
    //  n/2^k=1==>n=2^k =>log2n==log2 2^k =>apply property log a^b  base a=b=>log n base 2 =k.
}
