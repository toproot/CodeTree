import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int scholar = 0;

        if (a >= 90) {
            if (b >= 95) {
                scholar = 100000;
            }else if (b >= 90) {
                scholar = 50000;
            }
        }

        System.out.print(scholar);
    }
}