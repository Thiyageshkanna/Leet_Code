package src.LeetCode.Binary_Search.Medium;

public class Single_Element_In_A_Sorted_Array_540 {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    //Binary Search with XOR Approach
    static int singleNonDuplicate(int[] nums){
        int start=0;
        int end=nums.length-2;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==nums[mid^1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return nums[start];
    }



    //Using binary Search Without XOR .
    static int singleNonDuplicate2(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(start<mid && mid<end && mid%2==0 && nums[mid]==nums[mid+1] || (mid%2==1 && nums[mid]==nums[mid-1])){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[start];
    }

}
