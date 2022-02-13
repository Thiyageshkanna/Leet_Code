package LeetCode.Array.Medium;

import java.util.Arrays;

public class Product_Of_Array_Except_Self_238 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExpectSelf1(nums)));
    }



    //Optimal Approach
    static int[] productExceptSelf(int[] nums){
        int n= nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=1;
        right[n-1]=1;
        for (int i = 1; i <  nums.length; i++) {
            left[i]=nums[i-1] * left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=nums[i+1] *right[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]= left[i] * right[i];
        }
       return nums;
    }
    //The most optimal and navie solution
    static int[] productExpectSelf1(int[] nums){
        int n= nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for (int i = 1; i < nums.length ; i++) {
            ans[i]=nums[i-1] * ans[i-1];
        }
        int mul=1;
        for (int j = n-1; j >=0 ; j--) {
            ans[j]=ans[j]*mul;
            mul*=nums[j];
        }
        return ans;
    }
    // brute Force Solution
    static int[] productExceptSelf2(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int mul=1;
            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    mul*=nums[j];
                    ans[i]=mul;
                }
            }
        }
        return ans;
    }
}
