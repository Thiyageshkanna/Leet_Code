package Basics.Java_Questions;

import java.util.Arrays;

public class Remove_Duplicate_In_An_Array {
    public static void main(String[] args) {
        int[] nums={1,2,8,1,7,4,6,1,3,6,3};
        System.out.println(Arrays.toString(duplicate(nums)));
    }

    private static int[] duplicate(int[] nums) {
        int ans[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    nums[j]=-1;
                }

            }
        }
       return ans;
    }
}
