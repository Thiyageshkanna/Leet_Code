package LeetCode.Binary_Search.Medium;

public class Reach_A_Number_754 {
    public static void main(String[] args) {
        int target=3;
        System.out.println(reachNumber(target));
    }
    static int reachNumber(int target){
        int currentPosition = 0;
        int stepCount = 1;
        int moves = 0;
        target = Math.abs(target);

        while(currentPosition < target || ((currentPosition - target) % 2 != 0)) {
            currentPosition = currentPosition + stepCount;
            stepCount++;
            moves++;
        }

        return moves;
    }
}
