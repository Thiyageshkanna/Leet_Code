package LeetCode.Array.Easy;
//https://leetcode.com/problems/missing-number/
public class Missing_Number_268 {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length ) {
            int check = nums[i];
            if (nums[i]<nums.length && nums[i] != nums[check]) {
                swap(nums, i, check);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length+1;
    }
    private static void swap(int[] nums, int i, int check) {
        int temp=nums[i];
        nums[i]=nums[check];
        nums[check]=temp;
    }
}
