package LeetCode.Array.Medium;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Find_All_Duplicates_In_An_Array_442 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1,3};
        List<Integer> al=new ArrayList<>();
        al=findDuplicates(nums);
        System.out.println(al);
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> al=new ArrayList<>();
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
        for (int j = 0; j < nums.length; j++) {
            if((j+1)!=nums[j]){
                al.add(nums[j]);
            }
        }
        // This is only for when duplicate value has thrice or more than that. to remove the duplicate.
        al=al.stream().distinct().collect(Collectors.toList());
        return al;
    }

    private static void swap(int[] nums, int i, int check) {
        int temp=nums[i];
        nums[i]=nums[check];
        nums[check]=temp;
    }
}
