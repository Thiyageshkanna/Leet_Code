package Theory.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] nums={2,4,1,5,3};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    private static void selectionSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int end=nums.length-1-i;
            int start=0;
            int maximumIndex=maximumIndex(nums,start,end);
            swap(nums,maximumIndex,end);
        }
    }
    //Swapping values
    private static void swap(int[] nums, int maximumIndex, int end) {
        int temp=nums[maximumIndex];
         nums[maximumIndex]=nums[end];
         nums[end]=temp;
    }
    //finding maximum Value index not maximum Value
    private static int maximumIndex(int[] nums,int start, int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
}
