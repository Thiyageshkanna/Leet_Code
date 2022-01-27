package LeetCode.Array.Medium;

import java.util.Arrays;

public class Find_The_Duplicate_Number_287 {
    public static void main(String[] args) {
        int[] nums={3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int i=0;
        while (i< nums.length){
            int check=nums[i]-1;
            if(nums[i]!=nums[check]){
                swap(nums,i,check);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        int answer=-1;
        for (int j = 0; j < nums.length; j++) {
            if(j+1!=nums[j]){
                answer=nums[j];
                return answer;
            }
        }
        return answer;
    }

    private static void swap(int[] nums, int i, int check) {
        int temp=nums[i];
        nums[i]=nums[check];
        nums[check]=temp;
    }
}
