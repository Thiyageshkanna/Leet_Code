package LeetCode.Array.Medium;
import java.util.Arrays;
//https://leetcode.com/problems/set-matrix-zeroes/submissions/

// This is a optimized approach but still it is not the best optimized approach
//It creates extra spaces because of two one-d Array.So Search for Optimized Approach
public class Set_Matrix_Zeroes_73 {
    public static void main(String[] args) {
        int[][] matrix={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
    }
    static void setZeroes(int[][] matrix) {
        int rowSize=matrix.length;
        int columnSize=matrix[0].length;
        // Creating two one-d array for rows and columns; and if the value is zero make that rows and column value as 1;
        int[] rows=new int[rowSize];
        int[] columns=new int[columnSize];
        for(int i=0;i<rowSize;i++){
            for (int j = 0; j < columnSize; j++) {
                if(matrix[i][j]==0){
                    rows[i]=1;
                    columns[j]=1;
                }
            }
        }
        //Check whether the rows and column values are 1 if it is 1 make the matrix as 0
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if(rows[i]==1 || columns[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
