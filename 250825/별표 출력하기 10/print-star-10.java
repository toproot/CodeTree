import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < 2 * N; i++) {
            if(i % 2 == 0) {
                for (int k = 0; k < 1 + i / 2; k++) {
                    System.out.print("* ");
                }
            }else {
               for (int k = 0; k < N - (i -1) / 2; k++) {
                    System.out.print("* ");
               } 
            }
            System.out.println();
        }
    }
}