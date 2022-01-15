package LeetCode.Array.Easy;
//https://leetcode.com/problems/flipping-an-image/
import java.util.Arrays;

public class Flipping_An_Image_832 {
    public static void main(String[] args) {
        int[][] image={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans=flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] flipAndInvertImage(int[][] image) {

        // Swapping with two pointers
        for (int i=0;i< image.length;i++){
            int start=0;
            int end=image.length-1;
            while(start<end){
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                start++;
                end--;
            }
        }

        //Inverting the image
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }

}
