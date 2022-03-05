package LeetCode.Binary_Search.Easy;

import java.sql.Time;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection_Of_Two_Arrays_349 {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(usingBinarySearch(nums1, nums2)));
    }
    //Binary Search
    //Time Complexity - 0(logn) no==> 0(N LogN)
    static int[] usingBinarySearch(int[] nums1,int[] nums2){
        Set<Integer> set=new HashSet<>();
        Arrays.sort(nums1);

        for(int i=0;i<nums2.length;i++){
            if(binarySearch(nums1,nums2[i])){
                set.add(nums2[i]);
            }
        }

        int[] ans=new int[set.size()];
        int position=0;
        for(Integer num:set){
            ans[position]=num;
            position++;
        }
        return ans;
    }
    static boolean binarySearch(int[] nums1,int num){
        int start=0;
        int end= nums1.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums1[mid]==num){
                return true;
            }
            else if(nums1[mid]>num){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    //Two Pointers
    //Time Complexity has to be 0(nlogn) because one array is traversed fully another one is not traversed fully
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
