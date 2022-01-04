package Basics;

public class Linear_Search_Kunal {
    public static void main(String[] args) {
        int ans=searchString("Thiyagesh Kanna",'g');
        System.out.println(ans);
    }
    static int searchString(String name,char target){
        for (int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                System.out.println(target);
                return i;
            }
        }

        return -1;
    }
}
