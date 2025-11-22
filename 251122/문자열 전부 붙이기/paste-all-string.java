import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String sResult = "";
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String str = sc.next();
            sResult += str;
        }

        System.out.print(sResult);
    }
}