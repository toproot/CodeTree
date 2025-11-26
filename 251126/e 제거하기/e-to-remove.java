import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char cE = 'e';

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == cE) {
                String sResult = str.substring(0, i) + str.substring(i+1);
                System.out.print(sResult);
                break;
            }
        }

    }
}