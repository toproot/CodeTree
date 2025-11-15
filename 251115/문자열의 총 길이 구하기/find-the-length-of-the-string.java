import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int iCnt = 0;

        for(int i = 0; i < 10; i++) {
            String str = sc.next();
            iCnt += str.length();
        }

        System.out.print(iCnt);
    }
}