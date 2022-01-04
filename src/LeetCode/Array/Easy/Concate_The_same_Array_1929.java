package LeetCode.Array.Easy;

// https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class Concate_The_same_Array_1929 {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] ans=concateArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] concateArray(int[] nums) {
        int length=nums.length *2;
        int[] newArray=new int[length];
        int position=0;
        for(int i=0;i<nums.length;i++){
            newArray[position]=nums[i];
            position++;
        }
        for(int i=0;i<nums.length;i++){
            newArray[position]=nums[i];
            position++;
        }


        return newArray;

//        or (Easy Method)
//         for(int i=0;i<nums.length;i++){
//            newArray[i]=newArray[i+nums.length]=nums[i];
//        }
//
    }
}
