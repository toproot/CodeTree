import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int A = sc.nextInt();

        for (int i = B; i>=A; i--) {
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}