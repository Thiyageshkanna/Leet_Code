package src.LeetCode.Binary_Search.Binary2D_Array;

import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        int[][] nums={
                {1,4,2},
                {7,9,12}
        };
        int target=9;
        System.out.println(Arrays.toString(search2dArray(nums,target)));
    }

    private static int[] search2dArray(int[][] nums, int target) {
        for (int rows = 0; rows <nums.length ; rows++) {
            for (int column = 0; column <nums[rows].length ; column++) {
                if(target==nums[rows][column]){
                    return new int[]{rows,column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
