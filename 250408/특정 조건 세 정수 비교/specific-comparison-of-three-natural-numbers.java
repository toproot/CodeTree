import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.print(1);
        }else {
            System.out.print(0);
        }
        if (a == b && b == c) {
            System.out.print(" "+1);
        }else {
            System.out.print(" "+0);
        }
    }
}