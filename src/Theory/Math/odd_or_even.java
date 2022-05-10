package src.Theory.Math;

public class odd_or_even {
    public static void main(String[] args) {
         int num=68;
         boolean ans=oddOrEven(num);
         if(!ans){
             System.out.println("The given number "+num+" is even");
         }
         else{
             System.out.println("The given number "+num+" is odd");

         }

    }

    private static boolean oddOrEven(int num) {
        //if the last binary number is 1,the given value is odd ,so if odd return true else return false

        return (num & 1)==1;

    }
}
