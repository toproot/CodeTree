import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] sList = new String[10];

        for(int i = 0; i < 10; i++) {
            String str = sc.next();
            sList[i] = str;
        }

        for(int i = 10-1; i >= 0; i--) {
            System.out.println(sList[i]);
        }
    }
}