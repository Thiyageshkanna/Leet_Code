package LeetCode.Math;

import java.util.HashMap;
import java.util.Map;

//t.ly/ujrRJ
public class Roman_To_Integer_13 {
    public static void main(String[] args) {
        String str="LVIII";
        System.out.println(romanToInt(str));
    }
    static int romanToInt(String s) {
        Map<Character,Integer> checking=new HashMap<>();
        checking.put('I', 1);
        checking.put('V', 5);
        checking.put('X', 10);
        checking.put('L', 50);
        checking.put('C', 100);
        checking.put('D', 500);
        checking.put('M', 1000);

        int result=checking.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >=0 ; i--) {
            if(checking.get(s.charAt(i))<checking.get(s.charAt(i+1))){
                result-=checking.get(s.charAt(i));
            }
            else{
                result+=checking.get(s.charAt(i));
            }
        }
        return result;

    }
}
