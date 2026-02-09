import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        printGCD(n, m);
    }

    public static void printGCD(int n, int m) {
        while(m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        System.out.print(n);
    }
}