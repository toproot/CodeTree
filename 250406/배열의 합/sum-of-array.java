import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] iArr = new int[4][4];
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                iArr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<4; i++) {
            int iSum = 0;
            for (int j=0; j<4; j++) {
                iSum += iArr[i][j];
            }
            System.out.println(iSum);
        }

    }
}