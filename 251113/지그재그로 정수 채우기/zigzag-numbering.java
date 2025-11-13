import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] iList = new int[N][M];

        int iNum = 0;

        for(int i = 0; i < M; i++) {
            if (i % 2 == 0) {
                for(int j = 0; j < N; j++) {
                    iList[j][i] = iNum;
                    iNum++;
                }
            }else {
                for(int j = N-1; j >= 0; j--) {
                    // 3, 2, 1, 0
                    iList[j][i] = iNum;
                    iNum++;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(iList[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}