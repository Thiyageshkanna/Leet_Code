package LeetCode.Binary_Search.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection_Of_Two_Arrays_349 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(usingTwoPointers(nums1, nums2)));
    }
    //Two Pointers
    static int[] usingTwoPointers(int[] nums1,int[] nums2){
        Set<Integer> set=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while (i <nums1.length && j<nums2.length ){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                set.add(nums1[i]);//or set.add(nums2[i]) both are same
                i++;
                j++;
            }
        }
        int[] ans=new int[set.size()];
        int position=0;
        for (Integer nums:set){
            ans[position]=nums;
            position++;
        }

        return ans;
    }

    //Hashing Method
    static int[] usingHash(int[] nums1, int[] nums2) {
        Set<Integer> firstSet=new HashSet<>();
        Set<Integer> secondSet=new HashSet<>();
        //First traversing the nums1 and  removing the duplicates and storing into the first Set
        for (int i = 0; i < nums1.length; i++) {
            firstSet.add(nums1[i]);
        }

        //Now traversing the nums2 and comparing the firstSet set whether the first and second set has same current
        // value ,If so add it in the second set.
        for (int i = 0; i < nums2.length; i++) {
            if(firstSet.contains(nums2[i])){
                secondSet.add(nums2[i]);
            }
        }
        //the secondSet size contains always lesser size because it only contains intersected values so size will be
        // lesser to check that we have used below statement
        System.out.println(firstSet.size()+" "+secondSet.size());

        int[] ans=new int[secondSet.size()];
        int position=0;
        for (Integer values : secondSet) {
            ans[position] = values;
            position++;
        }

        return ans;
    }

}
