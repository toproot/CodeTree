import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int iFlagNo = 1;

        for(int i = 1; i < N+1; i++) {
            for(int j = 0; j < N; j++) {
                if (j == 0) {
                    System.out.print(iFlagNo + " ");
                }else if (i % 2 == 1) {
                    iFlagNo++;
                    System.out.print(iFlagNo + " ");
                }else {
                    iFlagNo--;
                    System.out.print(iFlagNo + " ");
                }
            }
            iFlagNo += N;
            System.out.println();
        }
    }
}