package LeetCode.Binary_Search.Medium;
//Best Explanation to Understand
//https://www.youtube.com/watch?v=5u2hgR2QCgo
import java.util.Arrays;

public class koko_Eating_Bananas_875 {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
    }
    //Binary Search
    static int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end= Arrays.stream(piles).max().getAsInt();

        int ans=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            int time=timeChecking(piles,mid);
            if(time<=h){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    //linear Search
    static int minEatingSpeedLinearSearch(int[] piles,int h){
        int max=Arrays.stream(piles).max().getAsInt();
        for (int i = 1; i <= max; i++) {
            int time=timeChecking(piles,i);
            if(time==h){
                return i;
            }
        }
        return -1;
    }

    private static int timeChecking(int[] piles, int mid) {
        int sum=0;
        for (int i = 0; i < piles.length; i++) {
            sum += Math.ceil(1.0 * piles[i] / mid);
        }
        return sum;
    }
}
