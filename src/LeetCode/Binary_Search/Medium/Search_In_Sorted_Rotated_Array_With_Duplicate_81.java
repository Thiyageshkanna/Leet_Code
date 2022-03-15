package LeetCode.Binary_Search.Medium;
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/
public class Search_In_Sorted_Rotated_Array_With_Duplicate_81 {
    public static void main(String[] args) {
        System.out.println(finalAnswer());
    }
    static boolean finalAnswer(){
        int[] nums={1,0,1,1,1};
        int target=0;
        int ans=finalSearch(nums,target);
        boolean answer=false;
        if(ans>=0){
            return answer=true;
        }

            return answer;


    }
    static int finalSearch(int[] nums,int target){
        int pivot=pivotWithDupicate(nums);
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


    static int pivotWithDupicate(int[] nums){
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
