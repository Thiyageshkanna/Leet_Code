package Theory.Sorting;

import java.util.Arrays;

public class insertion_bubble {
    public static void main(String[] args) {
        int nums[] ={4,1,5,3,2};
        insertionSort(nums);
       // bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean isSwapping=false;
            for(int j=1;j< nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    isSwapping=true;
                }

            }
            //After j'th for loop
            if(!isSwapping){
                break;
            }
        }
    }

    private static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            boolean isSwapping =false;
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    isSwapping=true;
                }
                if(!isSwapping){
                    break;
                }
            }
        }
    }
}
