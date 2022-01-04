package GeeksForGeeks;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class Find_Position_of_an_Element_In_An_Sorted_infinite_Array {
    public static void main(String[] args) {
        int[] nums={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(nums,target));
    }

//    Finding start and end index and looping over till the target is in that start and end index

    static int ans(int[] nums,int target){
        int start=0;
        int end=1;
        while(target>nums[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(nums,target,start,end);
    }


    static int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+((end-start)/2);
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid+1;
            }
        }
        return -1;
    }
}
