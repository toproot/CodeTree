import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = N; i > 0; i--) {
            for(int j = N; j > 0; j--) {
                if (j <= i) {
                    System.out.print(j + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}