import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            A += N;
            System.out.println(A);
        }
    }
}