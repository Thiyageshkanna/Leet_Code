
package LeetCode.Hard;

public class Find_In_Mountain_Array_1095 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(answerFinal(nums,target));
    }
    static int answerFinal(int[] nums,int target){
         int peakElement=peakMountain(nums);
         int firstTry=orderDiagnosticBS(nums,target,0,peakElement);
         if(firstTry!=-1){
             return firstTry;
         }
         return orderDiagnosticBS(nums,target,peakElement+1,nums.length-1);
    }


//    Returns the Peak Element in an Array
    static int peakMountain(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    static int orderDiagnosticBS(int[] nums,int target,int start,int end){
        boolean isAsc=nums[start]<nums[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
           if(isAsc){
               if(nums[mid]>target){
                   end=mid-1;
               }
               else if(nums[mid]<target){
                   start=mid+1;
               }
           }
           else {
              if(nums[mid]<target){
                  end=mid-1;
              }
              else if(nums[mid]>target){
                  start=mid+1;
              }
           }

        }
        return -1;
    }
}
