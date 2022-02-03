package LeetCode.Array.Easy;
//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class Minimum_Cost_To_Move_Chips_To_Same_position_1217 {
    public static void main(String[] args) {
        int[] nums={2,2,2,3,3};
        System.out.println(minCostToMoveChips(nums));
    }

    static int minCostToMoveChips(int[] position) {
        int odd=0;
        int even=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
