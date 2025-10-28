import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++) {
            int iCnt = 0;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    iCnt++;
                }
            }
            if (iCnt == 2) {
                sb.append(i + " ");
            }
        }
        System.out.print(sb);
    }
}