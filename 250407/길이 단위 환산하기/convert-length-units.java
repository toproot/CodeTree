import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double dFt = 30.48d;
        double N = sc.nextDouble();

        System.out.printf("%.1f", N*dFt);
    }
}