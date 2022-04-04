package LeetCode.Array.Medium;
import java.util.*;
public class Majority_Element_229 {
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(majorityElement123(nums));
    }
    static List<Integer> majorityElement123(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();

        int count1=0;
        int count2=0;
        int whichElement1=Integer.MIN_VALUE;
        int whichElement2=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(whichElement1==nums[i]){
                count1++;
            }
            else if(whichElement2==nums[i]){
                count2++;
            }

            else if(count1==0){
                    count1=1;
                    whichElement1=nums[i];
            }

            else if(count2==0){
                count2=1;
                whichElement2=nums[i];
            }

            else{
                count1--;
                count2--;
            }

        }
        int finalCount1=0;
        int finalCount2=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==whichElement1){
                finalCount1++;
            }
            else if(nums[i]==whichElement2){
                finalCount2++;
            }

        }
        if(finalCount1>(nums.length/3)){
            al.add(whichElement1);
        }
        if(finalCount2>nums.length/3){
            al.add(whichElement2);
        }
        return al;
    }
}
