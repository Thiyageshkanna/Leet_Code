package LeetCode.Easy;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/


public class Find_Peak_Element_162_852 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(peakElement(nums));
    }
    static int peakElement(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start; // or end both are equal
    }
}
