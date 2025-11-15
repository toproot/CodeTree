import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] iList = new int[N][N];

        for(int i = 0; i < M; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            iList[r-1][c-1] = r*c;
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(iList[i][j] + " ");
            }
            System.out.println();
        }
    }
}