package LeetCode.Array.Easy;


import java.util.Arrays;

public class Majority_Element_169 {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement3(nums));
    }
    //Moore's Voting Algorithm
    //LeetCode Question
    static int majorityElement(int[] nums) {
        int whichElement=0;
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[whichElement]==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                whichElement=i;
                count=1;
            }
        }
        return nums[whichElement];
    }
    //Moore's Voting Algorithm
    //GeeksForGeeks Question
    //https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1#
    static int majorityElement2(int[] a,int size){
        int count =1;
        int res=0;
        for(int i=1;i<size;i++){
            if(a[res]==a[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                res=i;
            }
        }
        int finalCount=0;
        for(int i=0;i<size;i++){
            if(a[res]==a[i]){
                finalCount++;
            }
        }
        if(finalCount<=(size)/2){
            res= -1;
        }
        return a[res];
    }

    //brute force Approach
    static int majorityElement1(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            //Count has to be refreshed everytime otherwise it stores previous count
            int count=1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
    static int majorityElement3(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int count=1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>(nums.length)/2){
                return nums[i];
            }
        }
        return -1;
    }
}
