package LeetCode.Binary_Search.Binary2D_Array;

import java.util.Arrays;

public class BinarySearch_For_2D_Array {
    public static void main(String[] args) {
        int[][] nums={
                {10, 20, 30, 40},
                {15, 25, 25, 25},
                {28, 29, 27, 49},
                {33, 34, 38, 50}
        };
        int target=38;
        System.out.println(Arrays.toString(binarySearch(nums,target)));
    }
    static int[] binarySearch(int[][] nums,int target){
        int r=0;
        int c=nums.length-1;
        while (r<nums.length && c>=0){
            if(nums[r][c]==target){
                return new int[]{r,c};
            }
            else if(nums[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
