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
//        Finding range for start and end
//        For start: largest Individual element
//        For end : sum of the elements in the array
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }

//        When start and end are equal break loop
        while (start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int piece=1;
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]>mid){
//                    create sub array
//                    To do that start from the next index value.
                    sum=nums[i];
                    piece++;
                }
                else{
                    sum+=nums[i];
                }
            }
//            if pieces are higher, then the mid is smaller to increase that, increase start so mid increase
//            or if pieces is higher than the answer is in next to mid.
            if(piece>m){
                start=mid+1;
            }
//            if pieces are lower, then the mid is higher , to decrease , decrease end,so end=mid not mid-1
            else{
                end=mid;
            }
        }
//        return any start or end both are equal
        return start;

    }
}
