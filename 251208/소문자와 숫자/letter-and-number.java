import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                int n = 'a' + (int)(c - 'A');
                System.out.print((char)n);
            }else if(c >= 'a' && c <= 'z'){
                System.out.print((char)c);
            }else if (c >= '0' && c <= '9') {
                System.out.print(c);
            }
        }
    }
}