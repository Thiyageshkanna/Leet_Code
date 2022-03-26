package LeetCode.Array.Medium;

public class pow_50 {
    public static void main(String[] args) {
        double num=2.00000;
        System.out.println(myPow(num,10));
    }
    static double myPow(double x, int n) {
            double ans = 1;
            for (int i = 1; i <= n; i++) {
                ans=ans*x;
            }
            return ans;
    }
}
