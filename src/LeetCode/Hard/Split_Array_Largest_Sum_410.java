package LeetCode.Hard;

public class Split_Array_Largest_Sum_410 {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(nums,m));
    }
    static int splitArray(int[] nums,int m){
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while (start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int piece=1;
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]>mid){
                    sum=nums[i];
                    piece++;
                }
                else{
                    sum+=nums[i];
                }
            }
            if(piece>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;

    }
}
