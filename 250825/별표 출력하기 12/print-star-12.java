import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = N;
        if(N != 1 && N % 2 != 0) {
            M = N - 1;
        } 

        for(int i = 1; i < M+1; i++) { // 세로
            for (int j = 1; j < N+1; j++) { // 가로
                if (i == 1) {
                    System.out.print("* ");
                }else {
                    if (j >= i) {
                        if (j % 2 == 0) {
                            System.out.print("* ");
                        }else {
                            System.out.print("  ");
                        }
                    }else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }
}