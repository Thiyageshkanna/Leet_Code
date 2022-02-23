package Basics.Patterns;

public class Number_Pattern_tough_Question {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= n; row++) {
            int space=n-row;
            for (int spc = 1; spc <=space ; spc++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
