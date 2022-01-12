package LeetCode.Array.Easy;

public class Find_The_Highest_Altitude_1732 {
    public static void main(String[] args) {
        int[] gain={52,-91,72};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int ans=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(sum>=0){
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
