package src.Theory.Math;

public class Find_Ith_Bit_Of_A_Number {
    public static void main(String[] args) {
        int number=14;
        int i=3;
        System.out.println(checkBit(number,i));
    }

    private static int checkBit(int number, int i) {
        return ((number &(1<<(i-1)))>>(i-1));
    }
}
