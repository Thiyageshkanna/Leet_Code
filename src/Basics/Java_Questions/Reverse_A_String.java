package Basics.Java_Questions;

public class Reverse_A_String {
    public static void main(String[] args) {
        String str="Thiyagesh Kanna";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans=ans+str.charAt(i);
        }

        return ans;
    }

}
