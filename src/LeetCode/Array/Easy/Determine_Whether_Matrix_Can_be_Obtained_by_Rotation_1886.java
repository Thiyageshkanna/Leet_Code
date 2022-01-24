package LeetCode.Array.Easy;

import java.util.Arrays;

public class Determine_Whether_Matrix_Can_be_Obtained_by_Rotation_1886 {
    public static void main(String[] args) {
        int[][] maxtrix={
                {0,1},
                {1,0}
        };
        int[][] target={
                {1,0},
                {0,1}
        };
        boolean ans=findRotation(maxtrix,target);
        System.out.println(ans);
    }
    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i <4 ; i++) {
            if(same(mat,target)){
                return true;
            }
            mat=rotate(mat);
        }
        return false;
    }

    private static boolean same(int[][] mat, int[][] target) {
        boolean isSame=true;
            for(int i=0;i<mat.length;i++){
                for (int j = 0; j < mat[0].length; j++) {
                    if(target[i][j]!=mat[i][j]){
                        return isSame=false;
                    }
                }
        }
        return isSame;
    }

    static int[][] rotate(int[][]mat){
        int rows=mat.length;
        int columns=mat[0].length;
        int[][] ans=new int[columns][rows];
        for(int i=0;i<rows;i++){
            for (int j = 0; j < columns ; j++)
            {
                ans[j][rows-i-1]=mat[i][j];
            }
        }
        return ans;
    }
}
