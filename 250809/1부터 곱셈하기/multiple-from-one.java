import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= 10; i++) {
            result *= i;
            if (result >= N) {
                System.out.print(i);
                break;
            }
        }
    }
}