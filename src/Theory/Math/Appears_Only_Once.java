package src.Theory.Math;

import java.util.Arrays;

public class Appears_Only_Once {
    public static void main(String[] args) {
        int[] nums={1,3,4,5,4,5,1};
        System.out.println(check2(nums));
    }
    //  Naive Approach by XOR Gate(when you xor with same value it returns zero (1,1=> 0)
    //  and (0,0 =>1)
    // Time Complexity =>O(N)
    private static int check2(int[] nums){
        int unique=0;
        for (int i = 0; i < nums.length; i++) {
            unique^=nums[i];
        }
        return unique;
    }
    //Brute force approach by sorting the nums and checking the next consequence elements
    // Time Complexity =>O(nLogN) because it uses merge sort
    private static int check(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
