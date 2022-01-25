package Theory.Sorting;

import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        int nums[]={5,1,4,2,3};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
 
    private static void sort(int[] nums) {
        int i=0;
        while(i<nums.length){
            int checkedIndex=nums[i]-1;
            if(nums[i]!=nums[checkedIndex]){
                swap(nums,i,checkedIndex);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] nums, int i, int checkedIndex) {
        int temp=nums[i];
         nums[i]=nums[checkedIndex];
         nums[checkedIndex]=temp;
    }
}
