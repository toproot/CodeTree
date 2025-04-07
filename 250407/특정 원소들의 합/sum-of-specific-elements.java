import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] iArr = new int[4][4];
        int iSum = 0;

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                iArr[i][j] = sc.nextInt();
            }
        }

        for (int i=1; i<5; i++) {
            for (int j=0; j<i; j++) {
                iSum += iArr[i-1][j];
            }
        }

        System.out.print(iSum);
    }
}