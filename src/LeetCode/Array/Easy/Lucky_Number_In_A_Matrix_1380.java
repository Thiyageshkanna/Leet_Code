package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lucky_Number_In_A_Matrix_1380 {
    public static void main(String[] args) {
        int[][] nums={
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        List<Integer> al=new ArrayList<>();
        al=luckyNumber(nums);
        System.out.println(al);
    }

    private static List<Integer> luckyNumber(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int minColumnIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            // i th loop is common for both
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            //Finding smallest number in the row
            for (int j = 0; j < matrix[0].length; j++) {

                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minColumnIndex=j;
                }
            }
            //finding greatest number in the minColumnIndex
            // It only checks smallest row'th index column and return its maximum
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][minColumnIndex]>max){
                    max=matrix[j][minColumnIndex];
                }
            }
            //when both are fell in same place which is maximum column and minimum row add it to the arraylist
            if(min==max){
                al.add(min);
            }
        }
        return al;
    }
}
