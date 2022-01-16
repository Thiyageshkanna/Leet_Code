package LeetCode.Array.Easy;
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class Cells_With_Odd_Values_In_An_Matrix_1252 {
    public static void main(String[] args) {
        int m=2,n=3;
        int[][] indices={
                {0,1},
                {1,1}
        };
        int ans=oddCells(m,n,indices);
        System.out.println(ans);
    }
    static int oddCells(int m, int n, int[][] indices) {
        //Creating sepeate 1D Array For Rows And Columns
        int[] rows=new int[m];
        int[] column=new int[n];
        for(int[] arr:indices){
            rows[arr[0]]++;
            column[arr[1]]++;
        }
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((rows[i]+column[j])%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
