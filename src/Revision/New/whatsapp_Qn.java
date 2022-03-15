package Revision.New;

import java.util.Arrays;
import java.util.Scanner;
//3 ==> total size of array
//5
//0
//4
//123 ==>Add 1 to index 1 , add 2 to index 2, add 3 to index 3
//[6, 2, 7]

public class whatsapp_Qn {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=scn.nextInt();
        }
        int numberToAdd=scn.nextInt();
        String toString=String.valueOf(numberToAdd);
        for (int i = 0; i < size; i++) {
            char n=toString.charAt(i);
            int separate =Character.getNumericValue(n);
            arr[i]+=separate;
        }
        System.out.println(Arrays.toString(arr));
    }
}
