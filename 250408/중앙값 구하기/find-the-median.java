import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mid = 0;

        if (A > B && A > C) {
            if (B < C) {
                mid = C;
            }else {
                mid = B;
            }
        }else if (B > A && B > C) {
            if (A < C) {
                mid = C;
            }else {
                mid = A;
            }
        }else if (C > A && C > B) {
            if (A < B) {
                mid = B;
            }else {
                mid = A;
            }
        }

        System.out.print(mid);
    }
}