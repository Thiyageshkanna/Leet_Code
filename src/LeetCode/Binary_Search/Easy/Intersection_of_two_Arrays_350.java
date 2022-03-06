package LeetCode.Binary_Search.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_two_Arrays_350 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] ans = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    //Two Pointers
    static int[] intersect(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length * nums2.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int position=0;
        while (i <nums1.length && j<nums2.length ){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                ans[position]=nums1[i];//or set.add(nums2[i]) both are same
                i++;
                j++;
                position++;
            }
        }


        return Arrays.copyOfRange(ans,0,position);
    }
}