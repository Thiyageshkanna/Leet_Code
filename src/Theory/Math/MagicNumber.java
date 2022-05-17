package src.Theory.Math;

public class MagicNumber {
    public static void main(String[] args) {
        int MagicNumber=3;
        System.out.println(CheckMagicNumber(MagicNumber));
    }

    private static int CheckMagicNumber(int magicNumber) {
        int ans=0;
        int base=5;
        while (magicNumber>0){
            int last=magicNumber & 1;
            magicNumber=magicNumber>>1;

            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
}
