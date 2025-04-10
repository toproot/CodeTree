import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        System.out.printf(sum + " %.1f", (double)sum / N);
    }
}