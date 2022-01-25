package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Numbers_Disappeared_In_An_Array_448 {
    public static void main(String[] args) {
        int[] nums={1,1};
        List<Integer> al=new ArrayList<>();
        al=findDisappearedNumbers(nums);
        System.out.println(al);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> al=new ArrayList<>();
        int i=0;
        while (i<nums.length){
            int check=nums[i]-1;
            if( nums[i]!=nums[check]){
                swap(nums,i,check);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int j =0; j < nums.length; j++) {
            if((j+1)!=nums[j]){
                al.add(j+1);
            }
        }
        return al;
    }

    private static void swap(int[] nums, int i, int check) {
        int temp=nums[i];
        nums[i]=nums[check];
        nums[check]=temp;
    }

}
