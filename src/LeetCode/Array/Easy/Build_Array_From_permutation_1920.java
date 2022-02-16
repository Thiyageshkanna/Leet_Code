package LeetCode.Array.Easy;
//https://leetcode.com/problems/build-array-from-permutation/
import java.util.Arrays;

public class Build_Array_From_permutation_1920 {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray2(nums)));
    }


    private static int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    //This is the Optimized Solution Space o(1)

    private static int[] buildArray2(int[] nums){
        int n = nums.length;

        for(int i=0; i<n; i++){
            nums[i] = nums[i] + 1000*(nums[nums[i]]%1000);
        }
        for(int i=0; i<n; i++){
            nums[i]/=1000;
        }
        return nums;
    }
}
