import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 1;
        while(N / 2 != 1) {
            N /= 2;
            x++;
        }
        System.out.print(x);

    }
}