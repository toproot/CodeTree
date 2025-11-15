import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] iList = new int[N][N];
        int iCnt = 0;

        for(int i = 0; i < M; i++) {
            iCnt += 1;
            int r = sc.nextInt();
            int c = sc.nextInt();

            iList[r-1][c-1] = iCnt;
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(iList[i][j] + " ");
            }
            System.out.println();
        }
    }
}