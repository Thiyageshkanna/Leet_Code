package LeetCode.Array.Easy;
//https://leetcode.com/problems/plus-one/
import java.util.Arrays;

public class Plus_One_66 {
    public static void main(String[] args) {
        int[] digits={1,1,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        int lastDigit=digits.length;
        for(int i=lastDigit-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        // This comes only if the value has only [9] and to increase the array size to 2 we are using (n+1) and the
        // arr[0]=1; arr[1]=0;
        int[] newNumber=new int[lastDigit+1];
        newNumber[0]=1;
        return newNumber;
    }
}
