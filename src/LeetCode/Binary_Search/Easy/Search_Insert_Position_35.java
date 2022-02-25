package LeetCode.Binary_Search.Easy;
//https://leetcode.com/problems/search-insert-position/
public class Search_Insert_Position_35 {
    public static void main(String[] args) {
        int[] nums={3,5,6};
        int target=1;
        System.out.println(insertPosition(nums,target));
    }
    static int insertPosition(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
