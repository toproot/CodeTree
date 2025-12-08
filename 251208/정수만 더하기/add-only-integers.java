import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int iResult = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9') {
                String s = c + "";
                int n = Integer.parseInt(s);
                iResult += n;
            }
        }

        System.out.print(iResult);
    }
}