package Basics.Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row < 2*n ; row++) {
            int totalColumn;
            if(row>n){
                totalColumn=2*n-row;
            }
            else{
                totalColumn=row;
            }
            int space =n-totalColumn;
            for (int s = 1; s <=space ; s++) {
                System.out.print(" ");
            }
            for (int column = 1; column <=totalColumn ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
