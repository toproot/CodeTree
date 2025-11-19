import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int N = sc.nextInt();
        int strLength = str.length()-1;

        for (int i = strLength; i > strLength - N; i--) {
            System.out.print(str.charAt(i));
        }
    }
}