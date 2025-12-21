import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) >= '0' && A.charAt(i) <= '9') {
                continue;
            }else {
                A = A.substring(0, i);
                break;
            }
        }

        for(int i = 0; i < B.length(); i++) {
            if(B.charAt(i) >= '0' && B.charAt(i) <= '9') {
                continue;
            }else {
                B = B.substring(0, i);
                break;
            }
        }

        System.out.print(Integer.parseInt(A) + Integer.parseInt(B));
    }
}