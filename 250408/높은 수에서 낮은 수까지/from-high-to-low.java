import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B) {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }else {
            for (int i = B; i >= A; i--) {
                System.out.print(i + " ");
            }
        }
    }
}