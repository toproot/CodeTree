import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++) {
            String str = sc.next();
            if (str.length() > iMax) {
                iMax = str.length();
            }
            if (str.length() < iMin) {
                iMin = str.length();
            }
        }

        System.out.print(iMax - iMin);
    }
}