import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int n = 0;

            if(c >= 'A' && c <= 'Z') {
                n = 'a' + (c - 'A');
            }else if (c >= 'a' && c <= 'z') {
                n = 'A' + (c - 'a');
            }

            System.out.print((char)n);
        }
    }
}