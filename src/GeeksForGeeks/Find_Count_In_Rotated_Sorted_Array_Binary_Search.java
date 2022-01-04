package GeeksForGeeks;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class Find_Count_In_Rotated_Sorted_Array_Binary_Search {
    public static void main(String[] args) {
        int[] nums={7, 9, 11, 12, 5};
        int ans=pivot(nums);
        System.out.print("The total Number of time the array rotated is :  ");
        System.out.print(ans+1);
    }
    static int pivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end &&nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid> start && nums[mid]<nums[mid-1]){
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
