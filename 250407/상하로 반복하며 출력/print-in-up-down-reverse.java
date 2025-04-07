import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] iArr = new int[N][N];

        // 열방향으로 접근해서 배열 생성.
        for (int i=0; i<N; i++) {
            int cnt = 0;
            if (i%2 != 0) { // 홀수일 경우. 1, 3
                for(int j=N-1; j>=0; j--) {
                    cnt++;
                    iArr[j][i] = cnt;
                }
            }else { // 짝수일 경우. 0, 2
                for (int j=0; j<N; j++) {
                    iArr[j][i] = j+1;
                }
            }
        }

        // 출력
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(iArr[i][j]);
            }
            System.out.println("");
        }
    }
}