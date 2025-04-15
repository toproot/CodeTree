import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double dSum = 0d;
        double dAvg = 0d;

        for(int i = 0; i < 8; i++) {
            dSum += sc.nextDouble();
        }
        dAvg = dSum / 8;

        System.out.printf("%.1f", dAvg);
     }
}