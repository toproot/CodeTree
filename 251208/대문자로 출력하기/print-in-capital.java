import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if((c >= 'A' && c <= 'Z')){
                System.out.print(c);
            }else if((c >= 'a' && c <= 'z')){
                int n = (c - 'a') + 'A';
                System.out.print((char)n);
            }
        }
    }
}