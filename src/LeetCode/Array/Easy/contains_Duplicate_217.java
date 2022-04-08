package LeetCode.Array.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class contains_Duplicate_217 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    //By using HashSet -->o(N)
    static boolean containsDuplicate(int[] nums){
        Set<Integer> al=new HashSet<>();
        for (int i: nums) {
            if(!al.add(i)){
                return true;
            }
        }
        return false;
    }
    //By using Sorting Method -->o(N * LogN)
    static boolean containsDuplicate2(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    // By using Loops --> o(n*n)
    static boolean containsDuplicate1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
