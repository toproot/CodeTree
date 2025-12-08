import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        int sum = (int)c1 + (int)c2;

        int minus = 0;

        if((int)c1 > (int)c2) {
            minus = (int)c1 - (int)c2;
        }else if ((int)c2 > (int)c1) {
            minus = (int)c2 - (int)c1;
        }

        System.out.print(sum);
        System.out.print(" ");
        System.out.print(minus);
    }
}