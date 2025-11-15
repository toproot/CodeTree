import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String strLine = sc.nextLine();
        String str = sc.next();
        int iCnt = 0;

        for(int i = 0; i < strLine.length(); i++) {
            if(strLine.charAt(i) == str.charAt(0)) {
                iCnt++;
            }
        }

        System.out.print(iCnt);
    }
}