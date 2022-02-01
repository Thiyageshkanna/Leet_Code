package Basics.Java_Questions;
//Armstrong number
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        int duplicate=number;
        int finalAnswer=0;
        String dupi= String.valueOf(number);
        int lenght=dupi.length();
        while (number>0){
            int remainder=number%10;
            finalAnswer=(int) (finalAnswer+(Math.pow(remainder,lenght)));
            number/=10;
        }
        if(finalAnswer==duplicate){
            System.out.println(duplicate+" is a Armstrong Number ");
        }
        else{
            System.out.println(duplicate+" is not a Armstrong Number ");
        }
    }
}
