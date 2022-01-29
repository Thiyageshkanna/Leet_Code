package LeetCode.Array.Easy;

import java.util.Arrays;

public class Set_MisMatch_645 {
    public static void main(String[] args) {
        int[] nums={3,2,2};
        int[] ans=new int[2];
        ans=findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int i=0;
        while (i<nums.length){
            int check=nums[i]-1;
            if(nums[i]!=nums[check]){
                swap(nums,i,check);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if((j+1)!=nums[j]){
                ans[0]=nums[j];
                ans[1]=j+1;

        }
      }

        return ans;
    }

    private static void swap(int[] nums, int i, int check) {
        int temp=nums[i];
        nums[i]=nums[check];
        nums[check]=temp;
    }
}
