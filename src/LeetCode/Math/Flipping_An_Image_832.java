package src.LeetCode.Math;

import java.util.Arrays;

public class Flipping_An_Image_832 {
    public static void main(String[] args) {
        int[][] nums={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans=flipAndInvertImage(nums);
        System.out.println(Arrays.deepToString(ans));

    }
    private static int[][] flipAndInvertImage(int[][] image) {
        for (int[] rows:image) {
            for (int j = 0; j < (image[0].length+1)/2; j++) {
                int temp=rows[j]^1;
                rows[j]=rows[image[0].length-j-1]^1;
                rows[image[0].length-j-1] =temp;
            }
        }
        return image;
    }
}
