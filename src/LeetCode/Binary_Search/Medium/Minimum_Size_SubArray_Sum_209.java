package LeetCode.Binary_Search.Medium;


public class Minimum_Size_SubArray_Sum_209 {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,nums));
    }
    static int minSubArrayLen(int target, int[] nums) {

        int left=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while (sum>=target){
                ans=Math.min(ans,i+1-left);
                // i+1 for index value and -left for cancelling previous index elements.
                sum-=nums[left];
                //sum=sum-nums[left] for taking out the first and continoing while loop till it breaks
                left++;
                // moving the pointer towards right
            }
        }

       if(ans==Integer.MAX_VALUE)
       {
           return 0;
       } else
       {
           return ans;
       }

    }
}
