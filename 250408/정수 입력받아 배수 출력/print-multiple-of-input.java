import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        for (int i=N; i >= N; i++) {
            if (i%N == 0) {
                System.out.print(i + " ");
                cnt++;
            }

            if (cnt == 5) {
                break;
            }
        }
    }
}