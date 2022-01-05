package LeetCode.Binary_Search.Easy;
//https://leetcode.com/problems/valid-perfect-square/
public class Valid_Perfect_Square_367 {
    public static void main(String[] args) {
        int number=17;
        System.out.println(isPerfectSquare(number));
    }

    private static boolean isPerfectSquare(int number) {
        int start=1;
        int end=number;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(number==mid*mid){
                return true;
            }
            else if(mid*mid>number){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
