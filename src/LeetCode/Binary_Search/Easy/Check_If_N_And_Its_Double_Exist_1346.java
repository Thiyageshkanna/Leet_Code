package LeetCode.Binary_Search.Easy;

import java.util.HashSet;
import java.util.Set;

public class Check_If_N_And_Its_Double_Exist_1346 {
    public static void main(String[] args) {

        int[] arr={7,1,14,11};
        System.out.println("---------------");
        System.out.println(checkIfExist(arr));

    }
    //HashSet => o(n)
    static boolean checkIfExist(int[] arr) {
        Set<Integer> hs=new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(hs.contains(arr[i]*2) || (arr[i]%2==0 && hs.contains(arr[i]/2))){
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }


    //Using Two for loop as two pointer o(n2)
    static boolean checkIfExist2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j){
                    if(arr[i]==arr[j]*2){
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
