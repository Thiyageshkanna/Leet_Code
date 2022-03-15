package LeetCode.Binary_Search.Medium;

public class Find_Minimum_in_Rotated_Sorted_Array_153 {
    public static void main(String[] args) {
        int[] nums={3,1,2};
        System.out.println(answer(nums));

    }
    static int answer(int[] nums){
        int pivotPosition=pivot(nums);
        if(pivotPosition!=-1){
            return nums[pivotPosition+1];
        }
        else{
            return nums[0];
        }

    }
    static int pivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            //mid+1 so mid should be less than end, and if mid,end both are equals ArrayIndexOutOfBound
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            //mid-1 so mid should be greater than start, and if mid,start both are equals ArrayIndexOutOfBound

            else if(mid>start && nums[mid-1]>nums[mid]){
                return mid-1;
            }

            else if(nums[start]>nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
