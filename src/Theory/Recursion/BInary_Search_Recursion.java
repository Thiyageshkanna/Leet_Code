package Theory.Recursion;

public class BInary_Search_Recursion {
    public static void main(String[] args) {
        int[] nums={1,4,6,8,9,12,14,15,19};
        int target=6;
        System.out.println(binarySearch(nums,target,0,nums.length-1));
    }

    private static int binarySearch(int[] nums, int target,int start,int end) {
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return binarySearch(nums,target,start,mid-1);
        }
        else{
            return binarySearch(nums,target,mid+1,end);
        }
    }
}
