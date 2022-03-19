package LeetCode.Binary_Search.Medium;

public class Search_A_2D_Matrix_74 {
    public static void main(String[] args) {
        int[][] matrix={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target=3;
        System.out.println(searchMatrix(matrix,target));
    }
    //binary Search O(LogN)
    private static boolean searchMatrix(int[][] matrix,int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int[] ans=new int[n*m];

    }
    //Linear Search O(n*n)
    private static boolean searchMatrix1(int[][] matrix,int target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
