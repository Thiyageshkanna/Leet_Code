package LeetCode.Binary_Search.Easy;

public class Arranging_Chain_441 {
    public static void main(String[] args) {
        int n=8;
        System.out.println(arrangeCoins(n));
    }
    //Binary Approach
    static int arrangeCoins(int n){
        long start=0;
        long end=n;
        while (start<=end){
            long mid= start+(end-start)/2;
            long currSum=(mid*(mid+1))/2;
            if(currSum==n) return (int)mid;
            if(n<currSum){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return (int)end;
    }
    //This is not a Optimized Approach
    static int arrangeCoinss(int n){
        int count=1;
        while (n > 0) {
            n=n-count;
            if(n<0){
                break;
            }
            count++;
        }
        return count-1;
    }
}
