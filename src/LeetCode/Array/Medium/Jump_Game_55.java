package LeetCode.Array.Medium;
//https://leetcode.com/problems/jump-game/
public class Jump_Game_55 {
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    static boolean canJump(int[] nums) {
        //This is greedy Solution
        int reached=0;
        boolean isReached=true;
        //We are checking for false, if it reached is less than i, return false
        for (int i = 0; i < nums.length; i++) {
            if(reached<i){
                return false;
            }
            reached=Math.max(reached,i+nums[i]);
        }
        return true;
    }
}
