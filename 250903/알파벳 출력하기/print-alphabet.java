import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char c = 'A';

        for(int i = 1; i < N+1; i++) {
            for (int j =0; j < i; j++) {
                if (c > 90) {
                    c = 'A';
                }
                System.out.print(c);
                c += 1;
            }
            System.out.println();
        }
    }
}