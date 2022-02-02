package LeetCode.Array.Easy;

import java.util.Arrays;

public class Remove_Duplicate_From_Sorted_Array_26 {
    public static void main(String[] args) {
        int[] nums={0,0};
        System.out.println(removeDuplicate(nums));
    }

    private static int removeDuplicate(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for (int j=1 ;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i+1;
    }
}
