package Theory.Recursion;

public class Recursion {
    public static void main(String[] args) {
        message();
    }
    static int count=0;
    static void message(){
        count++;
        System.out.println("Thiyagesh Kanna");
        while (count<=5){
            message();
        }
    }
}
