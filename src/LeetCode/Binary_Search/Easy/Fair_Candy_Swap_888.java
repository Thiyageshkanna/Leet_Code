package LeetCode.Binary_Search.Easy;

import java.util.Arrays;

public class Fair_Candy_Swap_888 {
    public static void main(String[] args) {
        int[] aliceSize ={1,1};
        int[] bobSize={2,2};
        System.out.println(Arrays.toString(fairCandySwap1(aliceSize,bobSize)));
    }


    // brute force approach o(n2)
    static int[] fairCandySwap1(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sum1+=aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sum2+=bobSizes[i];
        }
        int diff=(sum1-sum2)/2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if(aliceSizes[i]-bobSizes[j]==diff){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return null;
    }
}
