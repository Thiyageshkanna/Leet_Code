package Theory.Recursion;
//Print name 5 Times
public class PrintNames {
    public static void main(String[] args) {
        String name="Thiyagesh Kanna";
        int nTimes=5;
        printName(name,nTimes);
    }
    static void printName(String name,int nTimes){
        if(nTimes==0){
            return;
        }
        System.out.println(name);
        printName(name,nTimes-1);
    }

}
