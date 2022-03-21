package Theory.Recursion;

public class print_1_To_N {
    public static void main(String[] args) {
        int n=10;
        print(n,1);
    }
    static void print(int n,int start){
        if(n==0){
            return;
        }
        System.out.println(start);
        print(n-1,start+1);
    }
}
