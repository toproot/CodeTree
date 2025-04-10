import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double cnt = 0d;
        int sumVal = 0;
        int avgVal = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n >= 0 && n <= 200) {
                cnt += 1;
                sumVal += n;
            }
        }

        System.out.printf(sumVal + " %.1f", sumVal/cnt);
    }
}