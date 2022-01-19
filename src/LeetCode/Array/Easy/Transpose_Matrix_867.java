package LeetCode.Array.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/
public class Transpose_Matrix_867 {
    public static void main(String[] args) {
        int[][] maxtrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(transpose(maxtrix)));

    }
    static int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int column=matrix[0].length;
        //interchanging the rows and columns to columns and row
        int[][] ans=new int[column][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <column ; j++) {
                //transposing the matrix
                ans[j][i]=matrix[i][j];
            }
        }

        return ans;
    }
}













