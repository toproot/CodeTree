import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sumVal = 0;
        int cnt = 0;

        while(true) {
            int N = sc.nextInt();
            if (N < 20 || N >= 30) {
                break;
            }

            sumVal += N;
            cnt += 1;
        }

        System.out.printf("%.2f",(double)sumVal/cnt);
    }
}