package Basics.Patterns;

public class Star_Reverse_2 {
    public static void main(String[] args) {
        for (int i = 5; i >0; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
