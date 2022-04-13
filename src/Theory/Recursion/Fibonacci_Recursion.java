package Theory.Recursion;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
        int num=4;
        System.out.println(fibo(num));
    }
    static int fibo(int num){
        if(num<2){
            return num;
        }
        return fibo(num-1) + fibo(num-2);
    }
}
