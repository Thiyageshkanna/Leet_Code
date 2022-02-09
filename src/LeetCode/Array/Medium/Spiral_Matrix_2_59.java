package LeetCode.Array.Medium;

import java.util.Arrays;

public class Spiral_Matrix_2_59 {
    public static void main(String[] args) {
        int n=3;
        int[][] nums=generateMatrix(n);
        System.out.println(Arrays.deepToString(nums));
    }
    static int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];

        if(n==0){
            return matrix;
        }

        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        int count=0;
        while (true){
            // Margin top, left to right
            for (int i = left; i <=right ; i++) {
                matrix[top][i]=++count;
            }
            top++;
            if(top>bottom || left>right){
                break;
            }
            // Margin right, top to bottom
            for (int i = top; i <=bottom ; i++) {
                matrix[i][right]=++count;
            }
            right--;
            if(top>bottom || left>right){
                break;
            }
            // Margin bottom, right to left
            for (int i = right; i >=left ; i--) {
                matrix[bottom][i]=++count;
            }
            bottom--;
            if(top>bottom || left>right){
                break;
            }
            // Margin left, bottom to top
            for (int i = bottom; i >=top ; i--) {
                matrix[i][left]=++count;
            }
            left++;
            if(top>bottom || left>right){
                break;
            }
        }
        return matrix;
    }
}
