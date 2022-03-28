package LeetCode.Array.Medium;
//link t.ly/bJo7
public class pow_50 {
    public static void main(String[] args) {
        double num=2.00000;
        System.out.println(myPow(num,-2));
    }
    static double myPow(double x, int n) {
               double ans=1.0;
               long num=n;
               if(num<0){
                   num=-1 * num;
               }
               while (num>0){
                   if(num%2==1){
                       ans=ans*x;
                       num=num-1;
                   }
                   else{
                       x=x*x;
                       num=num/2;
                   }
               }
               if(n<0){
                   ans=1/ans;
               }
                return ans;
    }
}
