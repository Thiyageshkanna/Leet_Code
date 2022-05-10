package src.Theory.Math;

import java.util.Arrays;

public class Appears_Only_Once {
    public static void main(String[] args) {
        int[] nums={1,3,4,5,4,5,1};
        System.out.println(check(nums));
    }

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
