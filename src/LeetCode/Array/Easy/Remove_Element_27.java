package LeetCode.Array.Easy;

import java.util.Arrays;

public class Remove_Element_27 {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(nums,val));
    }
    static int removeElement(int[] nums, int val) {
        int begin =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[begin]=nums[i];
                begin++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return begin;
    }

}
