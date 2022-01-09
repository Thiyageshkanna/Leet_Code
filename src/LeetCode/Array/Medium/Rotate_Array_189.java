package LeetCode.Array.Medium;
//https://leetcode.com/problems/rotate-array/
import java.util.Arrays;

public class Rotate_Array_189 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }
    static void rotate(int[] nums, int k) {
        k%=nums.length-1;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    static void reverse(int[] nums,int start,int end){
       while (start<end){
           int temp=nums[start];
           nums[start]=nums[end];
           nums[end]=temp;
           start++;
           end--;
       }
    }
}
