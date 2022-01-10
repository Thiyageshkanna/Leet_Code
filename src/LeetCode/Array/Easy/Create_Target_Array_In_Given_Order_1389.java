package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_In_Given_Order_1389 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] target=createTargetArray(nums,index);
        System.out.println(Arrays.toString(target));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        ArrayList<Integer> as=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            as.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            target[i]=as.get(i);
        }
        return target;
    }
}
