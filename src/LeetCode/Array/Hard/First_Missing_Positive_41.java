package LeetCode.Array.Hard;

import java.util.Arrays;

//https://leetcode.com/problems/first-missing-positive/
public class First_Missing_Positive_41 {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int i=0;
           while (i<nums.length){
               int check=nums[i]-1;
               if(nums[i]>0 && nums[i]< nums.length && nums[i]!=nums[check]){
                   swap(nums,i,check);
               }
               else{
                   i++;
               }
           }

        for (int j = 0; j <nums.length; j++) {
            if((j+1)!=nums[j]){
                return j+1;
            }
        }
        return nums.length+1;
    }

    private static void swap(int[] nums, int i, int check) {
        int temp =nums[i];
        nums[i]=nums[check];
        nums[check]=temp;
    }
}
