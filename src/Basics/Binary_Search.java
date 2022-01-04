package Basics;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={1,3,4,7,10,14,17,18,20,25,27};
        int target=25;
        int ans=findBinarySearch(arr,target);
        System.out.println(ans);
    }
    static int findBinarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                return mid+1;
            }
        }
        return -1;
    }
}
