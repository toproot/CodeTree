import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int cnt = 0;
        boolean bResult = false;

        for (int i = 0 ; i < A.length(); i++) {
            cnt++;
            String subA = A.substring(A.length()-1, A.length()) + A.substring(0, A.length()-1);
            if (subA.equals(B)) {
                System.out.print(cnt);
                bResult = true;
                break;
            }else {
                A = subA;
            }
        }
        if(!bResult) {
            System.out.print("-1");            
        }
    }
}