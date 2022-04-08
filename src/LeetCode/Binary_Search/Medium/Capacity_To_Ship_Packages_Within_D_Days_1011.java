package LeetCode.Binary_Search.Medium;
//Question Link : t.ly/Omt4
//t.ly/FNNA
public class Capacity_To_Ship_Packages_Within_D_Days_1011 {
    public static void main(String[] args) {
        int[] weights={3,2,2,4,1,4};
        int days=3;
        System.out.println(shipWithinDays(weights,days));
    }

    static int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;
        for (int i = 0; i < weights.length; i++) {
            start=Math.max(start,weights[i]);
            end+=weights[i];
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //checking whether days and mid weights equals with qn
            if(checkingWeightWithDays(weights,mid,days)){
                //if equals store the answer and search for best answer;
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    private static boolean checkingWeightWithDays(int[] weights, int mid, int days) {
        int d=1;
        int sum=0;
        for (int i = 0; i < weights.length; i++) {
            if(sum+weights[i]<=mid){
                sum+=weights[i];
            }
            else{
                sum=weights[i];//reset
                d++;//increase no. the day
            }
        }
//       if(d==days){
//           return true;
//        }
//        else{
//            return false;
//        }
        return d<=days;
    }
}
