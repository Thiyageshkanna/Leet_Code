package LeetCode.Array.Easy;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
import java.util.ArrayList;
import java.util.List;

public class Kids_With_The_Greatest_number_Of_Candies_1431 {
    public static void main(String[] args) {
        int[] nums={2,3,5,1,3};
        int n=3;
        System.out.println(kidsWithCandies(nums,n));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls=new ArrayList<>();
        int maximum=0;
        for(int i=0;i<candies.length;i++){
            maximum=Math.max(maximum,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=maximum){
                ls.add(true);
            }
            else{
                ls.add(false);
            }
        }
        return ls;
    }
}
