import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] iList = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == 0) {
                    iList[i][j] = 1;
                }else if (j == 0) {
                    iList[i][j] = 1;
                }else {
                    int iUp = iList[i-1][j];
                    int iUpLeft = iList[i-1][j-1];
                    int iLeft = iList[i][j-1];
                    
                    iList[i][j] = iUp + iUpLeft + iLeft;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(iList[i][j] + " ");
            }
            System.out.println();
        }
    }
}