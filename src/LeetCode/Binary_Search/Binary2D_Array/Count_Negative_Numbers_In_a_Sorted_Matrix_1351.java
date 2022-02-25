package LeetCode.Binary_Search.Binary2D_Array;

public class Count_Negative_Numbers_In_a_Sorted_Matrix_1351 {
    public static void main(String[] args) {
        int[][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegative(grid));
    }
    static int countNegative(int[][] grid){
        int count=0;
        for (int rows = 0; rows < grid.length; rows++) {
            for (int col = 0; col < grid[0].length; col++) {
                if(grid[rows][col]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
