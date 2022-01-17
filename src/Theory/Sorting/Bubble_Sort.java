package Theory.Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] nums={2,4,1,5,3};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean isSwapped=false;
            for (int j = 1; j <nums.length-i ; j++) {
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    isSwapped=true;
                }
            }
            // When the input is already in best case ,we don't need to go for counting (i) so we are breaking
            if(!isSwapped){
                break;
            }
        }
    }
}
