import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] iList = new int[N][M];

        int iCnt = 0;
        int iFlag = 0;
        int jFlag = 0;

        for(int i = 0; i < (N+M)-1; i++) {
        	
        	iList[iFlag][jFlag] = iCnt;

            int iSubFlag = iFlag;
            int jSubFlag = jFlag;

            while(true) {
                if (!(iSubFlag >= 0 && iSubFlag < N) || !(jSubFlag >= 0 && jSubFlag < M)) {
                    break;
                }

                iCnt += 1;
                iList[iSubFlag][jSubFlag] = iCnt;
                
                iSubFlag += 1;
                jSubFlag -= 1;
            }
            
            if (jFlag < M-1) {
                jFlag += 1;
            }else if (jFlag >= M-1) {
                iFlag += 1;
            }
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(iList[i][j] + " ");
            }
            System.out.println();
        }
    }
}