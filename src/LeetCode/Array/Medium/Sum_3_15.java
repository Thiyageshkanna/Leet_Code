package LeetCode.Array.Medium;

import java.util.*;

//t.ly/s89F
public class Sum_3_15 {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    //Two Pointer Approach Iterative Approach ==> TC => O(n^2)
    //Beacause we are sorting the Array
    static List<List<Integer>> threeSum(int[] nums){
        int n=nums.length;
        if(n<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        //We Are using set of list not list of list because we need should not store duplicate triplets array
        Set<List<Integer>> result=new HashSet<>();
        for (int i = 0; i < n-2; i++) {
            int j=i+1;
            int k=n-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return new ArrayList(result);
    }

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
