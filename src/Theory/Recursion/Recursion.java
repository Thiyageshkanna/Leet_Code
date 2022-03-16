package Theory.Recursion;

public class Recursion {
    public static void main(String[] args) {
       message(1);
    }
    static int message(int num){
        if(num==6) {
            return 0;
        }
        System.out.println(num);
        return message(num+1);

    }
}
