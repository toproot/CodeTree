import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int prod = 1;

        for (int i = 1; i<= B; i++) {
            if (i%A == 0){
                prod *= i;
            }
        }

        System.out.print(prod);
    }
}