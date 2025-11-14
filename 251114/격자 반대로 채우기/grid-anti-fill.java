import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] iList = new int[N][N];
        int iCnt = 0;
        int iFlag = 0;

        for(int i = N-1; i >= 0; i--) {
            if(iFlag == 0) {
                for(int j = N-1; j >= 0; j--) {
                    iCnt += 1;
                    iList[j][i] = iCnt;
                }
                iFlag += 1;
            }else {
                for(int j = 0; j < N; j++) {
                    iCnt += 1;
                    iList[j][i] = iCnt;
                }
                iFlag -= 1;
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(iList[i][j] + " ");
            }
            System.out.println();
        }

    }
}