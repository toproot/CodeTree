import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] iList1 = new int[N][M];
        int[][] iList2 = new int[N][M];
        int[][] iList3 = new int[N][M];

        for(int i = 0; i < 2; i++) {

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int iNum = sc.nextInt();

                    if(i == 0) {
                        iList1[j][k] = iNum;
                    }else if (i == 1) {
                        iList2[j][k] = iNum;
                    }
                    
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(iList1[i][j] == iList2[i][j]) {
                    iList3[i][j] = 0;
                }else {
                    iList3[i][j] = 1;
                }
                System.out.print(iList3[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}