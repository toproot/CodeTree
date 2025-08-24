import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int iStarCnt = 1;

        for(int i = N; i > 0; i--) {
            // 공백 출력
            for (int k = (i*2-2); k > 0; k -= 1) {
                System.out.print(" ");
            }

            for (int j = 0; j < iStarCnt; j++) {
                System.out.print("* ");
            }
            iStarCnt += 2;
            System.out.println();
        }
    }
}