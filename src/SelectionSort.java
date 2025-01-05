public class SelectionSort {

    public static void main(String [] args){
        int [] nums={64,25,12,22,11};
        sortArray(nums);
    }


    public static int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[index]){
                    index=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
        }
        return nums;
    }
}
