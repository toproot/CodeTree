import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cnt++;
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}