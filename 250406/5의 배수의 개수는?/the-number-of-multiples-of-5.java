import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] iArr = new int[4][4];
        int cnt = 0;

        for(int i=0; i<4; i++) {
            for (int j=0; j<4; j++){
                iArr[i][j] = sc.nextInt();
                if (iArr[i][j] % 5 == 0) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}