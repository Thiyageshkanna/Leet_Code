package LeetCode.Array.Medium;

import java.util.Arrays;

public class Sort_Colors_75 {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
    }
    //by using bubble sort method just a brute force approach
    static void sortColors(int[] nums) {
        boolean isSorted=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                    isSorted=true;
                }
            }
            if(!isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    private static void swap(int[] nums,int num, int num1) {
        int temp=nums[num];
        nums[num]=nums[num1];
        nums[num1]=temp;

    }
}
