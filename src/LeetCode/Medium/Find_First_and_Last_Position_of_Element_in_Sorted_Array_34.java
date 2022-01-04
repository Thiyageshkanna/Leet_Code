package LeetCode.Medium;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

//Example 2:
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,7,7,8,8,8,10};
        int target=7;
        int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums,int target) {
        int[] ans={-1,-1};
        ans[0]=Index(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=Index(nums,target,false);
        }
        return ans;
    }
//    It returns both start and end Index Value with boolean value
    static int Index(int[] nums, int target,boolean startIndex){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while (start <= end) {
            int mid=start + ((end-start))/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
//            Here Comes the main part
            else{
                ans=mid;
                if(startIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
