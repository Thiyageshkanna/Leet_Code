package LeetCode.Array.Medium;

import java.util.*;

//t.ly/s89F
public class Sum_3_15 {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    //

    //Brute Force Approach with time complexity of ==> O(n^3)
    static  List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        //We Are using set of list not list of list because we need should not store duplicate triplets array
        Set<List<Integer>> result=new HashSet<>();
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k]==0){
                       result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        //make that set of list to list of List
        return new ArrayList(result);
    }
}
