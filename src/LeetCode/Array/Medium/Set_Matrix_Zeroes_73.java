package LeetCode.Array.Medium;
import java.util.Arrays;
//https://leetcode.com/problems/set-matrix-zeroes/submissions/


public class Set_Matrix_Zeroes_73 {
    public static void main(String[] args) {
        int[][] matrix={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroesOptimalSolution(matrix);
    }

    //This is a preferred optimal solution for this question
    static void setZeroesOptimalSolution(int[][] matrix){


        boolean firstRow=false;
        boolean firstColumn=false;

        //checking for first Row
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                firstRow = true;
                break;
            }
        }
        //checking for First Column
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0]==0){
                firstColumn=true;
                break;
            }
        }
        //its like making the 1st row and 1st column as creating two one-d array as reference to make that column or
        // row as 0
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //Now make that rows and columns as zero with reference to 1st row and 1st column expect first row and column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //For 1st column if zero available make the column as zero with matrix.length not matrix[0].length

        if (firstColumn){
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][0]=0;
            }
        }
        //For 1st column if zero available make the column as zero with matrix[0].length not matrix.length

        if(firstRow){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

    }



    // This is a optimized approach but still it is not the best optimized approach
//It creates extra spaces because of two one-d Array.So Search for Optimized Approach
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
