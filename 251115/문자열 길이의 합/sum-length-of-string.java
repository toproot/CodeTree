import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int iCnt = 0;
        int iACnt = 0;

        for(int i = 0; i < N; i++) {
            String str = sc.next();

            iCnt += str.length();

            if(str.charAt(0) == 'a') {
                iACnt++;
            }
        }

        System.out.print(iCnt + " " + iACnt);
    }
}