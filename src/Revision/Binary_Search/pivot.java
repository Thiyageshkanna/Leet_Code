package Revision.Binary_Search;

public class pivot {
    public static void main(String[] args) {
        int[] nums={7,8,9,0,3,5};
        System.out.println(pivotSearch(nums));
    }
    static int pivotSearch(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return nums[mid];
            }
            else if (mid>start && nums[mid-1]>nums[mid]){
                return nums[mid-1];
            }
            else if (nums[start]>nums[mid]){
                end=mid-1;
            }
            // Or nums[start]<nums[mid]
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
