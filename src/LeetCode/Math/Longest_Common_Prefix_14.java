package LeetCode.Math;

public class Longest_Common_Prefix_14 {
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }

    static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix=strs[0];
        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
