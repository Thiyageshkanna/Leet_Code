package LeetCode.Array.Easy;
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
import java.util.Arrays;

public class Find_N_Unique_Integers_Sum_Up_To_Zero_1304 {
    public static void main(String[] args) {
        int number=5;
        int[] ans=sumZero(number);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] sumZero(int n) {
        int[] nums=new int[n];
        int start=0;
        int end=n-1;
        int value=1;
        //Making value as 1 because {-1,-2,0,2,1} when n=5
        // if value as 0 {-0,-2,0,-2,0}
        //So use value as 1
        while (start<end){
            nums[start]=value;
            nums[end]=-value;
            value++;
            start++;
            end--;
        }
        return nums;
    }
}
