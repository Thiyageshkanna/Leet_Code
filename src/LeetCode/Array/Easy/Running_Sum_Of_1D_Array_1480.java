package LeetCode.Array.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class Running_Sum_Of_1D_Array_1480 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] ans=new int[nums.length];
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {

       for(int i=1;i<nums.length;i++){
          nums[i]+=nums[i-1];
       }
        return nums;
    }
}












