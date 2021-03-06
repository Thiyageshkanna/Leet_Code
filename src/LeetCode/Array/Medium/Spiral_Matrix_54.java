package LeetCode.Array.Medium;

//https://leetcode.com/problems/spiral-matrix/
import java.util.ArrayList;

public class Spiral_Matrix_54 {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        ArrayList<Integer> al=new ArrayList<>();
        al=spiralOrder(matrix);
        System.out.println(al);
    }
    static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> al=new ArrayList<>();
        if(matrix.length==0 || matrix[0].length==0){
            return al;
        }
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        //breaks only when one of the if condition is true
        while(true){
            //matrix top, left to right
            for(int i=left;i<=right;i++){
                al.add(matrix[top][i]);
            }
            top++;
            if(left>right || top>bottom){
                break;
            }
            //matrix right, top to bottom
            for(int i=top;i<=bottom;i++){
                al.add(matrix[i][right]);
            }
            right--;
            if(left>right || top>bottom){
                break;
            }
            // Matrix bottom, right to left
            for(int i=right;i>=left;i--){
                al.add(matrix[bottom][i]);
            }
            bottom--;
            if(left>right || top>bottom){
                break;
            }
            // Matrix left, bottom to top
            for(int i=bottom;i>=top;i--){
                al.add(matrix[i][left]);
            }
            left++;
            if(left>right || top>bottom){
                break;
            }
        }
        return al;
    }
}
