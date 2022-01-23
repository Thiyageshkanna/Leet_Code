package LeetCode.Array.Easy;
//https://leetcode.com/problems/maximum-population-year/

//Explanation
//https://leetcode.com/problems/maximum-population-year/discuss/1554972/JAVA-SOLUTION-EASY-and-EXPLAINED
public class Maximum_Population_Year_1854 {
    public static void main(String[] args) {
        int[][] logs={
                {1993,1999},
                {2000,2010}
        };
        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int[] arr=new int[101];
        for(int[] log: logs){
            for(int i=log[0];i<log[1];i++){
                arr[i-1950]++;
            }
        }
        int result=1950;
        int maxValue=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>maxValue){
            maxValue=arr[i];
            result=i+1950;
        }
        }

        return result;
    };
}
