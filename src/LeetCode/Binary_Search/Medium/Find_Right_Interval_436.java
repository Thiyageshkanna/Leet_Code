package LeetCode.Binary_Search.Medium;

import java.util.Arrays;

//https://leetcode.com/problems/find-right-interval/
public class Find_Right_Interval_436 {
    public static void main(String[] args) {
        int[][] intervals={
                {3,4},
                {2,3},
                {1,2}
        };
        System.out.println(Arrays.toString(findRightIntervals(intervals)));
    }
    static int[] findRightIntervals(int[][] intervals){
        int[] result=new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            result[i]=search(intervals[i][1],intervals);
        }
        return result;
    }
    static int search(int num,int[][] intervals){
        int index=-1;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][0]>=num && intervals[i][0]<min){
                //for Storing index value
                index=i;
                //Checking whether this is the minimum value
                min=intervals[i][0];
            }
        }
        return index;
    }
}
