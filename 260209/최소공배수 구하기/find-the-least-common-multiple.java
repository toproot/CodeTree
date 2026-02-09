import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        printLCM(n, m);
    }

    public static void printLCM(int n, int m) {
        int N = n;
        int M = m;

        while(m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        int GCD = n;
        int LCM = (N * M) / GCD;
        System.out.print(LCM);
    }
}