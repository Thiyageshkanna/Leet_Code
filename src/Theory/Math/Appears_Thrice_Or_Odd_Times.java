package src.Theory.Math;

public class Appears_Thrice_Or_Odd_Times {
    public static void main(String[] args) {
        int[] nums={2,2,2,4,4,4,3};
        System.out.println(appearsOnlyOnce(nums));
    }

    private static int appearsOnlyOnce(int[] nums) {
        int result=0;
        for (int i = 0; i <=32; i++) {
            int x=1<<i;
            int sum=0;
            for (int j = 0; j < nums.length; j++) {
                if(((nums[j]&x)!=0)){
                    sum++;
                }
            }
            if(sum%3!=0){
                result =result | x;
            }
            
        }
        return result;
    }
}
