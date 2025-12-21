import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String a = "";
        String b = "";

        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) >= '0' && A.charAt(i) <= '9') {
                a += A.charAt(i);
            }
        }

        for(int i = 0; i < B.length(); i++) {
            if(B.charAt(i) >= '0' && B.charAt(i) <= '9') {
                b += B.charAt(i);
            }
        }

        System.out.print(Integer.parseInt(a) + Integer.parseInt(b));
    }
}