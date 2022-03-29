package LeetCode.Array.Easy;


public class Majority_Element_169 {
    public static void main(String[] args) {
        int[] nums={2,2,3,3,3,3,2};
        System.out.println(majorityElement(nums));
    }
    //brute force Approach
    static int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            //Count has to be refreshed everytime otherwise it stores previous count
            int count=1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
}
