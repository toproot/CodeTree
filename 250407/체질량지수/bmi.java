import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int bmi = (10000*w) / (h*h);
        System.out.println(bmi);
        if (bmi >= 25) {
            System.out.print("Obesity");
        }
    }
}