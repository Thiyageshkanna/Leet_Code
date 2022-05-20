package src.Theory.Math;

public class Power_Of_Two {
    public static void main(String[] args) {
        // if a number is power of two,In binary form it has only one 1,if of has more than one 1 it is not a power of two ;
        int number=16;
        if(power(number)==1){
            System.out.println("The Given Number is Power of 2");
        }
        else{
            System.out.println("The Given Number is not a Power of 2");
        }
    }
    private static int power(int number){
        int count=0;
        while (number>0){
            int last=number&1;
            if(last==1){
                count++;
            }
            number=number>>1;
        }
        System.out.println(count);
        return count;
    }
}
