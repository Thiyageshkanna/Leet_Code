package LeetCode.Array.Medium;

import java.util.Arrays;

public class next_Permutation_31 {
    public static void main(String[] args) {
        int[] nums={2,3,1};
        nextPermutation(nums);
    }
    static void nextPermutation(int[] nums) {
        int infectedIndex=0;
        int n=nums.length-1;
        //greater than zero because when i=0 (i-1) will go negative value and it will cause ArrayIndexOutfBoundation
        for (int i = n; i>0 ; i--) {
            if(nums[i]>nums[i-1]){
                infectedIndex=i;
                break;
                //here we are using break becoz we want to find the minimum
            }
        }
        //If the element is already sorted in descending order, then return in ascending order as per question
        if(infectedIndex==0){
            Arrays.sort(nums);
        }
        else {
            int toSwap=nums[infectedIndex-1];
            int minValue=Integer.MAX_VALUE;
            for (int j = infectedIndex; j <=n ; j++) {
                if(nums[j]-toSwap>0 && nums[j]-toSwap<minValue ){
                    minValue=nums[j]-toSwap;
                    swap(nums,infectedIndex-1,j);
                }
            }
        }
        Arrays.sort(nums,infectedIndex,nums.length);
        System.out.println(Arrays.toString(nums));

    }
    static void swap(int[] nums,int infectedIndex,int j){
        int temp=nums[infectedIndex];
        nums[infectedIndex]=nums[j];
        nums[j]=temp;
    }
}
