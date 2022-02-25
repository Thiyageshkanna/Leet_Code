package Basics;

//finding the target element if not return the  greater element which is next to the target element
//Input1:1,3,5,12,13,15,18,27,29,33,36,44
//Input2:39
//Output:44

public class Binary_Search_Ceiling_And_Floor_Kunal {
    public static void main(String[] args) {
        int[] arr={2,3,5,12,13,15,18,27,29,33,36,44};
        int target=44;
        int ans=findCeiling(arr,target);
        System.out.println(ans);
    }
    static int findCeiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target>= arr[arr.length-1]){
            System.out.println("The Target element is same or greater than the given array elements");
            return 0;
        }
        if(target<=arr[0]){
            System.out.println("The target element is same or smaller than the given array elements");
            return 0;
        }
        while(start<=end){
            int mid=start+((end-start)/2);
            //This is for greatest element
            if(arr[mid]==target){
                start=mid+1;

            }
            //this is for smallest element
//            if(arr[mid]==target) ==> end=mid-1;

            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return arr[start]; //return 44

        // Return arr[end] if you needed next smallest element of target element 36

    }

}
