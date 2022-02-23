package LeetCode.Binary_Search.Easy;

public class Arranging_Chain_441 {
    public static void main(String[] args) {
        int n=8;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n){
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
