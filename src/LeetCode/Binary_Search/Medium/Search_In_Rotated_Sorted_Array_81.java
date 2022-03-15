package LeetCode.Binary_Search.Medium;

public class Search_In_Rotated_Sorted_Array_81 {
    public static void main(String[] args) {
        System.out.println(ans());
    }
    static boolean ans(){
        int[] nums={1,0,1,1,1};
        int target=0;
        boolean answer=false;
        int value=finalAnswer(nums,target);
        if(value>=0){
            return true;
        }
        return false;
    }
    static  int finalAnswer(int[] nums,int target){
        int pivot=pivot(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return target;
        }
        else if(nums[0]<=target){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);

    }
    static int binarySearch(int[] nums,int target,int start,int end){
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
        return -1;
    }
    static int pivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]==nums[start] && nums[mid]==nums[end]){
//                Checking whether start is the pivot
                if(mid<end && nums[start]>nums[start+1]){
                    return start;
                }
//                if not ignore the start
                start++;
//                Check whether end is pivot

                if(mid>start && nums[end]<nums[end-1]){
                    return end-1;
                }
//                if not ignore the end
                end--;
            }
            else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
