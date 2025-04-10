import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        double cnt = 0d;
        int sumVal = 0;
        int avg = 0;

        for(int i = A; i <= B; i++) {
            if(i%5 == 0 || i%7 ==0) {
                cnt++;
                sumVal += i;
            }
        }

        System.out.printf(sumVal + " %.1f", sumVal/cnt);
    }
}