package LeetCode.Medium;
//https://leetcode.com/problems/search-in-rotated-sorted-array/



public class Search_In_Sorted_Rotated_Array_33 {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(finalSearch(nums,target));
    }
    static int finalSearch(int[] nums,int target){
        int pivot=pivot(nums);
        // if you did not find a pivot, it means the array is not rotated
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        // if pivot is found, you have found 2 asc sorted arrays
        if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            // end=pivot-1;
            return binarySearch(nums,target,0,pivot-1);
        }
        // if(nums[pivot]>target)
        // start =pivot+1
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }


    static int binarySearch(int[] nums,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]==target){
                return mid;
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
            else if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }


}
