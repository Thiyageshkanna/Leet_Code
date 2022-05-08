package src.LeetCode.String;

public class Implement_strStr_28 {
    public static void main(String[] args) {
        System.out.println(strStr("Hello","ll"));
    }
    static int strStr(String haystack, String needle) {
        if(needle==null){
            return 0;
        }
        if(needle.length()>haystack.length()){
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
