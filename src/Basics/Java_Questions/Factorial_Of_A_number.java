package Basics.Java_Questions;

public class Factorial_Of_A_number {
    public static void main(String[] args) {
        int num=5;
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        for(int i=num-1;i>0;i--){
            num*=i;
        }
        return num;
    }
}
