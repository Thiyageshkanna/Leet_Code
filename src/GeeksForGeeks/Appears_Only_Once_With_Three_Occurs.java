package src.GeeksForGeeks;
//t.ly/VPDi
public class Appears_Only_Once_With_Three_Occurs {
    public static void main(String[] args) {
        int[] nums={1, 10, 1, 1};
        System.out.println(appears(nums));
    }

    private static int appears(int[] nums) {
        int one=0;
        int two=0;
        int common;
        for (int i = 0; i < nums.length; i++) {
            // store if it has two times, no need to remove if it has three times
            two=two | (one & nums[i]);
            //store if it has only one time ,remove if it has two times
            one=one ^ nums[i];

            common=one & two;

            //remove from one
            one=one & ~(common);
            //remove from two
            two=two&~(common);

        }
        return one;
    }
}
