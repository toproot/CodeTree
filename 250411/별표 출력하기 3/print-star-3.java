import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int space = 0;

        for(int i = N; i > 0; i--) {

            for(int k = 0; k < space; k++) {
                System.out.print("  ");
            }
            space += 1;

            for(int j = 0; j < (i*2-1); j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}