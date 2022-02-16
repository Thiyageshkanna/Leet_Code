package LeetCode.Math;

public class Palindrome_Number_9 {
    public static void main(String[] args) {
        int x=1211;
        System.out.println(isPalindrome(x));
    }
    static  boolean isPalindrome(int x) {
        int num=x;
        int reversed=0;
        while (num>0){
            int lastDigit=num%10;
            reversed=(reversed*10)+(lastDigit);
            num/=10;
        }
        if(x==reversed){
            return true;
        }
      return false;
    }
}
