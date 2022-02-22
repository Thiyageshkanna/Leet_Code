package Basics.Patterns;

public class Star_Increasing_Decreasing {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row < 2*n; row++) {
            int c;
            if(row>n){
                 c=2*n-row;
            }
            else{
                c=row;
            }
            for (int column = 1; column <= c; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
