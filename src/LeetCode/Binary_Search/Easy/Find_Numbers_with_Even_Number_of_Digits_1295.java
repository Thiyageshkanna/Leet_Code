package LeetCode.Easy;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int ans=evenNumbers(nums);
        System.out.println(ans);
    }
    static int evenNumbers(int[] arr){
        int even=0;
        int finalEven=0;
        for (int i = 0; i < arr.length ; i++) {
            while(arr[i]>0){
                even++;
                arr[i]/=10;
            }

            if(even%2==0){
                finalEven++;
            }
            even=0;
        }
        return finalEven;
    }
}
