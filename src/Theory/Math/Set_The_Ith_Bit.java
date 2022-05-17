package src.Theory.Math;

public class Set_The_Ith_Bit {
    public static void main(String[] args) {
        int number=10;
        int i=2;
        System.out.println(setIth(number,i));
    }

    private static int setIth(int number, int i) {
        return  (1<<i) | number;

    }
}
