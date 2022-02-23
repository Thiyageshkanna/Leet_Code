package LeetCode.Binary_Search.Medium;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class Two_Sum_2_167 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(binarySearch(nums, target)));
    }
    static int[] binarySearch(int[] nums,int target){
        int[] ans=new int[2];
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int sum=nums[start]+nums[end];
            if(sum>target){
                end--;
            }
            else if(sum<target){
                start++;
            }
            else{
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
        }
        ans[0]=start+1;
        ans[1]=end+1;
        return ans;
    }
}
