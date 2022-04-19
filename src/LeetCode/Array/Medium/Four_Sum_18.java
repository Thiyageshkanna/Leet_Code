package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum_18 {
    public static void main(String[] args) {
        int[] nums={1,0,-1,0,-2,2};
        System.out.println(fourSum(nums,0));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> al=new ArrayList<>();
        if(nums==null || nums.length==0){
            return al;
        }
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            int target_i=target-nums[i];
            for (int j = i+1; j < nums.length ; j++) {
                int target_j=target_i-nums[j];
                int front=j+1;
                int end=nums.length-1;
                while (front<end){
                    int two_sum=nums[front]-nums[end];
                    if(two_sum<target_j){
                        front++;
                    } else if (two_sum>target_j) {
                        end--;
                    }
                    else{
                        List<Integer> al2=new ArrayList<>();
                        al2.add(nums[i]);
                        al2.add(nums[j]);
                        al2.add(nums[front]);
                        al2.add(nums[end]);
                        al.add(al2);
                        // Processing the duplicates of number 3
                        while (front < end && nums[front] == al2.get(2)) ++front;

                        // Processing the duplicates of number 4
                        while (front < end && nums[end] == al2.get(3)) --end;
                    }
                }
                while(j + 1 < nums.length && nums[j + 1] == nums[j]) ++j;
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) ++i;
        }
        return al;
    }
}
