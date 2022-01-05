package LeetCode.Binary_Search.Easy;
//https://leetcode.com/problems/sqrtx/
public class Sqrt_69 {
    public static void main(String[] args) {
        int number=8;
        System.out.println(mySqrt(number));
    }

    static int mySqrt(int number) {
        if(number==0) return 0;
        long start=1;
        long end=number;
        int ans=0;
        while (start<=end){
            long mid=start+(end-start)/2;
            if(number==mid*mid){
                return ans=(int)mid;
            }
            else if(mid*mid>number){
                end=mid-1;
            }
            else if(mid*mid<number){
                start=mid+1;
                ans= (int) mid;
            }
        }
        return ans;
    }
}
