package Theory.Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int num=5;
        System.out.println(fibo(num));
    }
    static int fibo(int num){
        int first=0;
        int second=1;
        int sum=0;
        for (int i = 2; i < num; i++) {
            sum=first+second;
            int temp=first;
            first=second;
            second=sum;
        }
        return sum;
    }
}
