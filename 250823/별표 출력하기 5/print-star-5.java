import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i > 0; i--) {
            String star = "";
            for (int s = 0; s < i; s++) {
                star += "*";
            }
            for (int j = 0; j < i; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }
    }
}