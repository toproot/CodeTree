import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] iList = new int[N][M];

        int iNum = 1;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                iList[i][j] = iNum;
                iNum++;
                System.out.print(iList[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}