package LeetCode.Binary_Search.Easy;

public class amazon {
    public static void main(String[] args) {
        int[] nums={0,0,0,0,0,0,0,0,1,1};
        System.out.println(answer(nums));
    }
    static int answer(int[] nums){
        int start=0;
        int end= nums.length-1;
        int ans=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>0){
                end=mid-1;
            }
            else if(nums[mid]==0){
                ans=mid;
                start=mid+1;
            }
        }
        return ans+1;
    }
}
