import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] iList = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j) {
                    iList[i][j] = 1;
                    break;
                }else if(j == 0) {
                    iList[i][j] = 1;
                }else {
                    int iUp = iList[i-1][j];
                    int iUpLeft = iList[i-1][j-1];
                    iList[i][j] = iUp + iUpLeft;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(iList[i][j] + " ");
                if(i == j) {
                    break;
                }
            }
            System.out.println();
        }
    }
}