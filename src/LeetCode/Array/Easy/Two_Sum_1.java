package LeetCode.Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class Two_Sum_1 {
    public static void main(String[] args) {
        int[] nums={2,5,5,11};
        int target=10;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    //HashMap
    static int[] twoSum(int[] nums,int target){
        int[] result =new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return result;
    }
    // this approach will give Time Complexity as O(N2) ---Brute Force Approach
    static int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target==nums[i]+nums[j]){
                    return new int[]{i, j};

                }
            }

        }
        return new int[]{0,0};
    }
}
