package LeetCode.Easy;
//2D array
//https://leetcode.com/problems/richest-customer-wealth/

public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3},{3,5}};
        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int finalAns = 0;
        for (int row = 0; row < accounts.length; row++) {
            int ans = 0;
            System.out.println(finalAns);
            for (int column = 0; column < accounts[row].length; column++) {
                ans += accounts[row][column];
            }
            if (finalAns < ans) {
                finalAns = ans;
            }
            ans = 0;
        }
        return finalAns;
    }
}
