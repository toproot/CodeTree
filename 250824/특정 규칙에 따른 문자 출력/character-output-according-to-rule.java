import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int iCharCnt = 1;

        for (int i = N; i > 0; i--) {
            for(int j = 0; j < i*2-2; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < iCharCnt; k++) {
                System.out.print("@ ");
            }
            iCharCnt += 1;
            System.out.println();
        }

        for (int i = N-1; i > 0; i--) {
            for(int k = 0; k < i; k++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}