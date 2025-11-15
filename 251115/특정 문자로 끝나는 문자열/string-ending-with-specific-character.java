import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] sList = new String[10];
        String str = "";
        int iCnt = 0;

        for(int i = 0; i < 10; i++) {
            sList[i] = sc.next();
        }
        str = sc.next();

        for(int i = 0; i < 10; i++) {
            int iStrLength = sList[i].length();
            if(sList[i].charAt(iStrLength-1) == str.charAt(0)){
                iCnt++;
                System.out.println(sList[i]);
            }
        }

        if(iCnt == 0) {
            System.out.print("None");
        }
    }
}