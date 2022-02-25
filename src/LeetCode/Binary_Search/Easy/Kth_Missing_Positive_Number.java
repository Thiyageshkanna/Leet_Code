package LeetCode.Binary_Search.Easy;

//https://leetcode.com/problems/kth-missing-positive-number/
public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int k=2;
        System.out.println(findKthPositive(nums,k));
    }
    static int findKthPositive(int[] nums,int k){
        for (int i :nums) {
            if(i<=k) k++;
            else{
                break;
            }
        }
        return k;
    }
}
