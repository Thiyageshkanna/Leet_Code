package LeetCode.Array.Hard;
//https://leetcode.com/problems/count-of-smaller-numbers-after-self/

//This answer is correct. It passed 58 test cases balance test case not passed due to time limit exit.
import java.util.ArrayList;
import java.util.List;


public class Count_Of_Smaller_Numbers_After_Self {
    public static void main(String[] args) {
        int[] nums={-1,-2};
        List<Integer> as=new ArrayList<Integer>();
        as=countSmaller(nums);
        System.out.println(as);
    }
    static List<Integer> countSmaller(int[] nums) {
        List<Integer> as=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            as.add(count);
        }
        return as;
    }
}
