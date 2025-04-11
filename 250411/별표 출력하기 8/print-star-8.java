import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int star = 2;

        for(int i = 1; i <= N; i++) {
            if (i%2 != 0) {
                System.out.println("*");
            }else {
                for(int j = 0; j < star; j++) {
                    System.out.print("* ");
                }
                star += 2;
                System.out.println("");
            }
        }
    }
}