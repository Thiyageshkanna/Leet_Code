package LeetCode.Array.Easy;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Add_To_Array_Form_Of_Integers_989 {
    public static void main(String[] args) {

        int[] nums={1,2,3,4};
        int k=1;
        LinkedList<Integer> al=new LinkedList<>();
        al= (LinkedList<Integer>) addToArrayForm(nums,k);
        for (Integer integer : al) {
            System.out.print(integer);
        };

    }
    static List<Integer> addToArrayForm(int[] num, int k){
      int length=num.length-1;
      LinkedList<Integer> ans=new LinkedList<>();
      while (length>=0 || k!=0){
          if(length>=0){
              //Adding with last value
              k+=num[length];
              length--;
          }
          //adding the last value with k at the first index. when the loop goes the before index goes to second and
          // the newly index comes first
          ans.addFirst(k%10);
          k/=10;
      }
return ans;

    }
}
