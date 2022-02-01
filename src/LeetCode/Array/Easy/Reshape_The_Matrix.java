package LeetCode.Array.Easy;
//https://leetcode.com/problems/reshape-the-matrix/submissions/
import java.util.Arrays;

public class Reshape_The_Matrix {
    public static void main(String[] args) {
        int[][] mat={
                {1,2},
                {3,4}
        };
        int r=1,c=4;
        int[][] ans=matrixReshape(mat,r,c);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans=new int[r][c];
        int matRow=mat.length;
        int matColumn=mat[0].length;
        //checking whether rows and columns has same size . if some size is reduced in r and c it returns index out
        // of bound E.g r=1,c=3;
        if(matRow *matColumn!=r*c){
            return mat;
        }
        int row=0;
        int column=0;
        for (int i = 0; i < matRow; i++) {
            for (int j = 0; j < matColumn; j++) {
                ans[row][column]=mat[i][j];
                column++;
                //Move to the next row when column is filled and make the column zero to start from 0
                if(column==c){
                    row++;
                    column=0;
                }
            }
        }

        return ans;
    }
}
