import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int iStarCnt = 1;

        for(int i = N; i > 0; i--){
            for(int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int k=0; k < iStarCnt; k++) {
                System.out.print("*");
            }
            if (iStarCnt < N*2-1) {
                iStarCnt += 2;
            }
            System.out.println();
        }

        iStarCnt -= 2; 

        for (int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < iStarCnt; k++) {
                System.out.print("*");
            }
            iStarCnt -= 2;
            System.out.println();
        }
    }
}