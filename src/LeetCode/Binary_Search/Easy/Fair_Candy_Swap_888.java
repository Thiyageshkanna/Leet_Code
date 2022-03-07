package LeetCode.Binary_Search.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    //HashMap
    static int[] fairCandySwap(int[] aliceSize,int[] bobSizes){
        int sum1=0;
        int sum2=0;
        Set<Integer> hs=new HashSet<>();
        for (int i = 0; i < aliceSize.length; i++) {
            sum1+=aliceSize[i];
            hs.add(aliceSize[i]);
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sum2+=bobSizes[i];
        }
        int diff=(sum1-sum2)/2;
        for (int i = 0; i < bobSizes.length; i++) {
            int target=bobSizes[i]+diff;
            if(hs.contains(target)){
                return new int[]{target,bobSizes[i]};
            }
        }
        return null;
    }
}
