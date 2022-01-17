package LeetCode.Array.Easy;
//https://leetcode.com/problems/matrix-diagonal-sum/
public class Matrix_Diagonal_Sum_1572 {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int rows=mat.length;
        int columns=mat[0].length;
        int sum=0;
        for(int i=0;i<rows;i++){
                sum+=mat[i][i];
                sum+=mat[i][columns-1-i];
        }
        if(rows * columns %2!=0){
            return sum-mat[rows/2][rows/2];
        }
        else{
            return sum;
        }
    }
}
