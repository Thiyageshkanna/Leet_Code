package LeetCode.Array.Medium;
//https://leetcode.com/problems/sort-colors/
import java.util.Arrays;

public class Sort_Colors_75 {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        //bubbleSortColors(nums);
    }
    //IG this is the most optimal approach for the question

    static void cycleSortOrCountingSort(int[] nums){
        int red=0;
        int white=0;
        int blue=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                red++;
            }
            else if(nums[i]==1){
                white++;
            }
            else if(nums[i]==2){
                blue++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i<red){
                nums[i]=0;
            }
            else if(i<(red+white)){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }





    //by using bubble sort method just a brute force approach
    static void bubbleSortColors(int[] nums) {
        boolean isSorted=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                    isSorted=true;
                }
            }
            if(!isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    private static void swap(int[] nums,int num, int num1) {
        int temp=nums[num];
        nums[num]=nums[num1];
        nums[num1]=temp;

    }
}
