import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=N; i++) {
            if (i%100 == 0 && i%400 != 0) {
                continue;
            }
            if (i%4 == 0) {
                sum += 1;
            }
        }
        System.out.print(sum);
    }
}