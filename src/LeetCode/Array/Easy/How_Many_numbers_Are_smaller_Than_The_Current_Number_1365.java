package LeetCode.Array.Easy;

import java.util.Arrays;

public class How_Many_numbers_Are_smaller_Than_The_Current_Number_1365 {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
