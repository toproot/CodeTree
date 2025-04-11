import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int flag = N-2;

        for(int i =0; i < N; i++) {
            for(int j = 0; j < N; j++ )  {
                if (i == 0) {
                    System.out.print("* ");
                }else if (flag > 0 && j >= i && j <= flag) {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}