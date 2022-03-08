package Revision.Binary_Search;

public class Ceiling_And_floor {
    public static void main(String[] args) {
        System.out.println("Ceiling");
        int[] nums={10,14,16,19,20,26,28,30,34,38,40,43,47,50};
        int target=33;
        System.out.println(ceiling(nums,target));
        System.out.println("----------------------------------------");
        System.out.println("Floor");
        System.out.println(floor(nums,target));
    }
    // Ceiling (greater than the target)
    static int ceiling(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return nums[mid+1]; //Return greater value than the target
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return nums[start]; //Return greater value than the target
    }
    //Floor (Lesser than the target)
    static int floor(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return nums[mid-1];
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return nums[end]; //returns lesser value
    }
}
