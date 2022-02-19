package LeetCode.Array.Medium;
//https://leetcode.com/problems/house-robber/

public class House_Robber_198 {
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(rob(nums));
    }
    static int rob(int[] nums) {
        int i=0;
        int ans=0;
        int j=1;
        while (i<nums.length){
            ans+=nums[i];
                i+=2;
        }
        int ans1=0;
        while (j<nums.length){
            ans1+=nums[j];
            j+=2;
        }
        return Math.max(ans,ans1);
    }
}
